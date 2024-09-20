/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salestaxs;

/**
 *
 * @author walter n
 */
import java.util.Scanner;
public class SalesTaxs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        double amount, total, tax;
        final double SALES_TAX = 0.05;
        
        System.out.println("Enter amount:      ");
        
        amount = scan.nextDouble();
        
        tax = amount * SALES_TAX;
        
        total = amount + tax;
        
        System.out.println("Receipt");
        System.out.println("----------------");
        System.out.printf("Amount: %3.2f \n", amount);
        System.out.printf("Tax rate:  %3.2f\n", SALES_TAX * 100);
        System.out.printf("Tax:   %3.2f\n", tax);
        System.out.printf("Total:   %3.2f\n", total);
        
        
    }
    
}
