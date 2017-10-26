/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Test class for the invoice account
 * @author MILTON PRO
 */
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Invoice myInvoice = new Invoice("AB01","Engine part",5,2500);
        System.out.print("Enter the part numer: ");
        String number = input.nextLine();
        myInvoice.setPartNumber(number);
        System.out.print("Enter the part description: ");
        String desc = input.nextLine();
        myInvoice.setPartDescription(desc);
        System.out.print("Enter the part quantity: ");
        int quantity = input.nextInt();
        System.out.print("Enter the price per unit: ");
        double priceItem = input.nextDouble();
        System.out.printf("Part number is: %s%n", myInvoice.getPartNumber());
        System.out.printf("Part description is: %s%n", myInvoice.getPartDesc());
        System.out.printf("Part quantity is: %s%n", myInvoice.getQty());
        System.out.printf("Price per unity part is: %s%n", myInvoice.getPrice());
    }
}
