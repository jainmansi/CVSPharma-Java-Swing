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
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory(){
    supplierList = new ArrayList<Supplier>();

}

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
        
    }
    
    public void removeSupplier(Supplier supplier){
        supplierList.remove(supplier);
    }
    
}
