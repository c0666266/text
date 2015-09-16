/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author c0666266
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price = 132.85;
        double tax = price * 0.13;
        double total = price + tax;

        System.out.println("neter the price");
//        double price = keyboard.nextDouble();

        System.out.println("the orginal price of item=" + price);
        System.out.println(tax);
        System.out.println(total);
        System.out.println("C\tF\n" + "-40\t-40\n" + "0\t32\n" + "20\t68\n" + "100\t212");
    }

}
