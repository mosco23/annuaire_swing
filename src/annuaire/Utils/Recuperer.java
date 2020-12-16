/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.Utils;

import annuaire.DB.Database;
import annuaire.Main;
import annuaire.personnes.Admin;
import annuaire.personnes.Student;
import annuaire.personnes.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mosco
 */
public class Recuperer {
    
    
    public static TreeSet<User> etudiants(ResultSet resultSet) throws SQLException{
        TreeSet<User> stus = new TreeSet<>();
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String nce = resultSet.getString("nce");
            String nom = resultSet.getString("nom");
            String prenoms = resultSet.getString("prenoms");
            String date2naissance = resultSet.getString("date2naiss");
            String lieu2naissance = resultSet.getString("lieu2naiss");
            String email = resultSet.getString("email");
            String mobile = resultSet.getString("mobile");
            Student student = new Student(id, nce, nom, prenoms, date2naissance, lieu2naissance, email, mobile);
        
            stus.add(student);
        }
    
        return stus;
        
    }
    
    public static TreeSet<User> admins(ResultSet resultSet) throws SQLException{
        TreeSet<User> admins = new TreeSet<>(); 
        while(resultSet.next()){
            String id = resultSet.getString("id");
            String nom = resultSet.getString("nom");
            String prenoms = resultSet.getString("prenoms");
            String email = resultSet.getString("email");
            String mobile = resultSet.getString("mobile");
            String password = resultSet.getString("password");
            
            Admin admin = new Admin(id, nom, prenoms, email, mobile, password);
            admins.add(admin);
        } 
            
        return admins;        
    }
    
    public static TreeSet<User> rechercheSimple(String table, String searchChar){
        ResultSet resultSet;
            TreeSet<User> users = new TreeSet<>();
            
        try{
            resultSet = Main.database.getByFirstChar(table, searchChar, "nom");
            
            if(table.equals(Student.class.getSimpleName()))
                users = Recuperer.etudiants(resultSet);
            else
                users = Recuperer.admins(resultSet);
            
        } catch (SQLException ex) {
            Logger.getLogger(Recuperer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        return users;
    }

    
    
}