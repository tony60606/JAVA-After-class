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
        Book book1 = new Book() ;
        book1.name = "方OO" ;
        book1.hour = 4 ;
        book1.booking();
        System.out.println("-------------------");
        Book book2 = new Book() ;
        book2.name = "徐OO" ;
        book2.hour = 6 ;
        book2.booking();
        System.out.println("-------------------");
        Book book3 = book2 ;
        book3.name = "呂XX" ;
        book2.booking();
        book3.booking();
        System.out.println("-------------------");
        book1 = book3 ;
        book1.booking();
        book3.booking();
        
        
    }
    
}
