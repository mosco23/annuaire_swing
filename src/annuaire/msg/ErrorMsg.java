/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.msg;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author mosco
 */
public class ErrorMsg {
    
    
    public ErrorMsg(String text){
        JOptionPane.showMessageDialog(null, text, "Erreur", JOptionPane.ERROR_MESSAGE);
        
    }
    
    public ErrorMsg(Component component, String text){
        JOptionPane.showMessageDialog(component, text, "Erreur", JOptionPane.ERROR_MESSAGE);
        
    }
    
    
    public ErrorMsg(){
        JOptionPane.showMessageDialog(null, "Oups ce utilisateur n'existe pas !", "Erreur", JOptionPane.ERROR_MESSAGE);
        
    }
    
    
    public ErrorMsg(Component component){
        JOptionPane.showMessageDialog(component, "Oups ce utilisateur n'existe pas !", "Erreur", JOptionPane.ERROR_MESSAGE);
        
    }
    
}
