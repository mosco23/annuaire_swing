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
public class Student extends User{
    
    private String nce;
    private String date2naissance;
    private String lieu2naissance;
    
    
    
    public Student(String id, String nce, String nom, String prenoms, String date2naissance, String lieu2naissance, String email, String mobile){
        super(id, nom, prenoms, email, mobile);
        this.nce = nce;
        this.date2naissance = date2naissance;
        this.lieu2naissance = lieu2naissance;
    }
    
    
    @Override
    public String toString(){
        return String.format("%s,'%s','%s','%s','%s','%s','%s','%s',%s", this.getId(), this.getNce(), this.getNom(), this.getPrenoms(), this.getDate2naissance(), this.getLieu2naissance(), this.getEmail(), this.getMobile(), null);
    }
    
    
    
    /* public Student getStudentBy(String[] str){
        return // new Student(); //(Student) database.getBy(this.getClass().getName(), str);
    } */

    /**
     * @return the nce
     */
    public String getNce() {
        return nce;
    }

    /**
     * @param nce the nce to set
     */
    public void setNce(String nce) {
        this.nce = nce;
    }


    /**
     * @return the date2naissance
     */
    public String getDate2naissance() {
        return date2naissance;
    }

    /**
     * @param date2naissance the date2naissance to set
     */
    public void setDate2naissance(String date2naissance) {
        this.date2naissance = date2naissance;
    }

    /**
     * @return the lieu2naissance
     */
    public String getLieu2naissance() {
        return lieu2naissance;
    }

    /**
     * @param lieu2naissance the lieu2naissance to set
     */
    public void setLieu2naissance(String lieu2naissance) {
        this.lieu2naissance = lieu2naissance;
    }
 
}
