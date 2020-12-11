/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.personnes;

/**
 *
 * @author mosco
 */
public class Admin extends User {
    
    private String password;
    public boolean isActive = false;
    
    public Admin(String nom, String prenoms, String email, String mobile, String password) {
        super(nom, prenoms, email, mobile);
        this.password = password;
        
    }
    
    @Override
    public String toString(){
        return String.format("%s,%s,%s,%s,%s,%d", this.getNom(), this.getPrenoms(), this.getEmail(), this.getMobile(), this.getPassword(), isActive);
    } 
    
    
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
}
