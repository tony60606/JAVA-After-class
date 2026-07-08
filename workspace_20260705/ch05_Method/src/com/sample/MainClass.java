/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book A1 = new Book() ;
        A1.ID = "D011101212045" ;
        A1.product = "痠痛藥布A" ;
        A1.price = 200 ;
        A1.quantity = 15 ;
        A1.getcost(100) ;
        A1.bookstore();
        System.out.println("----------------");
        Book A2 = new Book() ;
        A2.booking("D011101212049", "痠痛軟膏A", 250, 10);
        A2.getcost(150) ;
        A2.bookstore();
        System.out.println("----------------");
        Book A3 = new Book() ;
        A3.booking("D011101212050", "痠痛軟膏B", 200, 10);
        A3.getcost(220) ;
        A3.bookstore();
        System.out.println("----------------");
        Book A4 = new Book() ;
        A4.booking("D011101213011", "痠痛禮盒", 1200, 3);
        A4.getcost(1000) ;
        A4.bookstore();
        System.out.println("----------------");
        Book A5 = new Book("D01110131208","水性貼布",350,5) ;
        A5.getcost(300) ;
        A5.bookstore();
        System.out.println("----------------");
    }
    
}
