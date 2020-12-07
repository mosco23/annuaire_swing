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
    
    private String pseudo;
    private String password;
    
    public Admin(String nom, String prenoms, String pseudo, String email, String mobile, String password) {
        super(nom, prenoms, email, mobile);
        this.pseudo = pseudo;
        this.password = password;
        
    }
    
    @Override
    public String toString(){
        return String.format("%s,%s,%s,%s,%s,%s", this.getNom(), this.getPrenoms(), this.getPseudo(), this.getEmail(), this.getMobile(), this.getPassword());
    } 
    
    public String getPseudo(){
        return pseudo;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
}
