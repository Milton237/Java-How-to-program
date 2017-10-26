/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MILTON PRO
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String number, String desc, int quantity, double priceItem){
        this.partNumber = number;
        this.partDescription = desc;
        this.pricePerItem = priceItem;
        this.quantity = quantity;
    }
    
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    
    public void setPartDescription(String desc){
        this.partDescription = desc;
    }
    
    public void setPartQty(int qty){
        this.quantity= qty;
    }
    
    public void setPartPrice(double price){
        this.pricePerItem = price;
    }
    
    public double getPrice(){
        return this.pricePerItem;
    }
    
    public int getQty(){
        return this.quantity;
    }
    
    public String getPartNumber(){
        return this.partNumber;
    }
    
    public String getPartDesc(){
        return this.partDescription;
    }
    
    public double getInvoiceAmount(){
        double invoiceAmount = 0;
        if(this.quantity < 0){
            invoiceAmount= 0;
        }
        if(this.pricePerItem < 0){
            invoiceAmount= 0.0;
        }
        return invoiceAmount;
    }
    
    
}
