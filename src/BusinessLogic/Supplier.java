/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author user
 */
public class Supplier {
    private String supplierName;
    private int supplierId;
    private int contact;
    private static int count = 0;
    
    private DrugCatalog drugList;
    
    public Supplier(){
        drugList = new DrugCatalog();
        count ++;
        supplierId = count;        
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return supplierName;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public DrugCatalog getDrugList() {
        return drugList;
    }

    public void setDrugList(DrugCatalog drugList) {
        this.drugList = drugList;
    }
    
    
}
