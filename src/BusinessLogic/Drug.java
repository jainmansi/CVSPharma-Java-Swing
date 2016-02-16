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
public class Drug {
    private String name;
    private int id;
    private int price;
    private String manufacturer;
    private String licenceNum;
    private String expDate;
    private String concentration;
    private String mktdBy;
    private int mfgContact;
    private String mfgAddress;
    //private static int count =0;
    
    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public void setLicenceNum(String licenceNum) {
        this.licenceNum = licenceNum;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getMktdBy() {
        return mktdBy;
    }

    public void setMktdBy(String mktdBy) {
        this.mktdBy = mktdBy;
    }

    public int getMfgContact() {
        return mfgContact;
    }

    public void setMfgContact(int mfgContact) {
        this.mfgContact = mfgContact;
    }

    public String getMfgAddress() {
        return mfgAddress;
    }

    public void setMfgAddress(String mfgAddress) {
        this.mfgAddress = mfgAddress;
    }

    
    
    
}
