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
public class Database {
    
    Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String query;
    
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
    
    public boolean add(String table, Object object){
        try{
            query = "INSERT INTO "+table+" VALUES("+object.toString()+")";
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
    
    public ResultSet getByChar(String table, String searchChar, String attr){
        try{
            query = "SELECT * FROM "+table+" WHERE "+attr+" LIKE '"+searchChar+"%'";
            resultSet = statement.executeQuery(query);
            return resultSet;
        }catch(SQLException e){
            System.out.println("a is pressed !");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public ResultSet getByString(String table, String searchStr, String attr){
        try{
            query = "SELECT * FROM "+table+" WHERE "+attr+" LIKE ‘%"+searchStr+"%’";
            System.out.println(query);
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString("first_name")+ " "+resultSet.getString("last_names"));
            }

            return statement.executeQuery(table);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean modify(String table, String attribute_one, String value_one, String attribute_two, String value_two){
        try{
            query = "UPDATE "+table+"SET "+attribute_one+"="+value_one+" WHERE "+attribute_two+"="+value_two;
            statement.executeUpdate(query);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean pop(String table, String attr, String value){
        try{
            query = "DELETE FROM"+table+"WHERE"+attr+"="+value;
            statement.executeUpdate(query);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
    }
}