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
public class SuccesMsg {
    public SuccesMsg(String text){
        JOptionPane.showMessageDialog(null, text, "Succès", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public SuccesMsg(Component component, String text){
        JOptionPane.showMessageDialog(component, text, "Succès", JOptionPane.DEFAULT_OPTION);
        
    }
    
    
    public SuccesMsg(){
        JOptionPane.showMessageDialog(null, "Tout C'est bien passé !", "Succès", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    public SuccesMsg(Component component){
        JOptionPane.showMessageDialog(component, "Tout C'est bien passé !", "Succès", JOptionPane.DEFAULT_OPTION);
        
    }
}
