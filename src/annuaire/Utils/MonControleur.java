/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.Utils;

import annuaire.Main;
import annuaire.menus.TypeOne;
import annuaire.menus.TypeTwo;

/**
 *
 * @author mosco
 */
public class MonControleur implements Runnable {

    @Override
    public void run() {
        if(Main.admin == null){
            Main.setjMenuBar(new TypeOne());            
        }
        else{
            Main.setjMenuBar(new TypeTwo());
        }

        System.err.println("je suis en cours ...");    
    }
    
}


