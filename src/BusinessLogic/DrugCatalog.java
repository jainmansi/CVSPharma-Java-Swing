/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DrugCatalog {
    private ArrayList<Drug> drugCatalog;
    
    public DrugCatalog(){
        drugCatalog = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(ArrayList<Drug> drugCatalog) {
        this.drugCatalog = drugCatalog;
    }  
    
    public Drug addDrug(){
        Drug d = new Drug();
        drugCatalog.add(d);
        return d;        
    }
    
    public void removeDrug(Drug drug){
        drugCatalog.remove(drug);
    }
}
