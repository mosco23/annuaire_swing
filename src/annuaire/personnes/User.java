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
public abstract class User implements Comparable{
    
    private String nom;
    private String prenoms;
    private String email;
    private String mobile;
    private String id;
    
    
    public User(String id, String nom, String prenoms, String email, String mobile){
        this.id = id;
        this.nom = nom.toUpperCase();
        this.prenoms = prenoms;
        this.email = email;
        this.mobile = mobile;
    }
    

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenoms
     */
    public String getPrenoms() {
        return prenoms;
    }

    /**
     * @param prenoms the prenoms to set
     */
    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    @Override
    public int compareTo(Object o){
        return this.comparator().compareTo(((User) o).comparator()  );
    }
    
    public String comparator(){
        return String.format("%s%s%s%s", this.getNom(), this.getPrenoms(), this.getEmail(), this.getMobile());
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    
    
}
