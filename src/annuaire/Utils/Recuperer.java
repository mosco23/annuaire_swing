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
    
    
    public static Student etudiant(ResultSet resultSet) throws SQLException{
        String nce = resultSet.getString("nce");
        String nom = resultSet.getString("nom");
        String prenoms = resultSet.getString("prenoms");
        String date2naissance = resultSet.getString("date2naiss");
        String lieu2naissance = resultSet.getString("lieu2naiss");
        String email = resultSet.getString("email");
        String mobile = resultSet.getString("mobile");
    
        return new Student(nce, nom, prenoms, date2naissance, lieu2naissance, email, mobile);
        
    }
    
    
    public static Admin admin(ResultSet resultSet) throws SQLException{
        String nom = resultSet.getString("nom");
        String prenoms = resultSet.getString("prenoms");
        String email = resultSet.getString("email");
        String mobile = resultSet.getString("mobile");
        String password = resultSet.getString("password");
        
        return new Admin(nom, prenoms, email, mobile, password);
        
    }
    
    public static TreeSet<User> recherche(Database database, String table, ArrayList<String> list, String searchChar){
        ResultSet resultSet;
        TreeSet<User> users = new TreeSet<>();
        for(String str : list){
            resultSet = database.getByChar(table, searchChar, str);
            users.addAll(sortedStudents(resultSet));
        }
        
        return users;
    }
    
    public static TreeSet<User> rechercheSimple(Database database, String table, String attr, String searchChar){
        ResultSet resultSet;
        TreeSet<User> users = new TreeSet<>();
        
        if(attr == null)
            attr = "nom";
        
        resultSet = database.getByChar(table, searchChar, attr);
        try {
            while(resultSet.next())       
                users.add(Recuperer.etudiant(resultSet));
        } catch (SQLException ex) {
            Logger.getLogger(Recuperer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
    }
    /*
    public static TreeSet<User> sorteUser(TreeSet<User> users) throws SQLException{
       for(User user : users){
            if(user.getClass().isInstance(Student.class))
                users.add(Recuperer.etudiant(resultSet));
            else
                users.add(Recuperer.admin(resultSet));
            
            
        }
        return users;
    }
*/

    public static TreeSet<Student> sortedStudents(ResultSet resultSet){
        TreeSet<Student> students = new TreeSet<>();
        try {
            while(resultSet.next()) {
                String nce = resultSet.getString("nce");
                String nom = resultSet.getString("nom");
                String prenoms = resultSet.getString("prenoms");
                String date2naissance = resultSet.getString("date2naiss");
                String lieu2naissance = resultSet.getString("lieu2naiss");
                String email = resultSet.getString("email");
                String mobile = resultSet.getString("mobile");
                Student student = new Student(nce, nom, prenoms, date2naissance, lieu2naissance, email, mobile);
                students.add(student);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return students;
    }
    
}
