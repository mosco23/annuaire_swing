/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.DB;

/**
 *
 * @author mosco
 */
public enum DB_Info {
    DB_USER("root"),
    DB_PASSWORD(""),
    DB_LINK("jdbc:mysql://localhost:3306/Annuaire?useSSL=false");
    private final String value;
    
    DB_Info(String value){
        this.value = value;
    }
    
    @Override
    public String toString(){
        return this.value;
    }
}
