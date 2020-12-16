/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author mosco
 */
public class Database{
    
    static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static String query;
    
    public Database() {
        initConnection(DB_Info.DB_LINK.toString(), DB_Info.DB_USER.toString(), DB_Info.DB_PASSWORD.toString());
    }
    
    public Database(String DB_LINK, String DB_USER, String DB_PASSWORD) {
        initConnection(DB_LINK, DB_USER, DB_PASSWORD);
    }
    
    
    private void initConnection(String DB_LINK, String DB_USER, String DB_PASSWORD){
        try{
            connection = DriverManager.getConnection(DB_LINK, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
            System.out.println("Connected !");
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean insert(String table, Object object){
        try{
            // vinitConnection(DB_Info.DB_LINK.toString(), DB_Info.DB_USER.toString(), DB_Info.DB_PASSWORD.toString());
            query = String.format("INSERT INTO %s VALUES(%s)", table, object.toString());
            System.err.println(query);
            statement.executeUpdate(query);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
    
    public ResultSet getAll(String table){
        try{
            query = String.format("SELECT * FROM %s;", table);
            resultSet = statement.executeQuery(query);

            return resultSet;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet getByFirstChar(String table, String searchChar, String attr){
        try{
            query = "SELECT * FROM "+table+" WHERE "+attr+" LIKE '%"+searchChar+"%'";
            resultSet = statement.executeQuery(query);
            return resultSet;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public ResultSet getByChar(String table, String attr, String searchChar){
        try{
            query = "SELECT * FROM "+table+" WHERE "+attr+" LIKE '"+searchChar+"%'";
            resultSet = statement.executeQuery(query);
            return resultSet;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet getByString(String table, String attr, String searchStr){
        try{
            query = String.format("SELECT * FROM %s WHERE %s='%s'", table, attr, searchStr);
            System.out.println(query);
            resultSet = statement.executeQuery(query);
            
            return resultSet;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean update(String table, String attribute_one, String value_one, String id){
        try{
            query = String.format("UPDATE %s SET %s=%s WHERE id='%s'", table, attribute_one, value_one, id);
            statement.executeUpdate(query);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean delete(String table, String id){
        try{
            query = "DELETE FROM"+table+"WHERE id='"+id+"'";
            statement.executeUpdate(query);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
}