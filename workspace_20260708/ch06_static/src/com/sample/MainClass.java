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
        book1.a = 1 ;
        Book.b = 15 ;
        book1.show();
        System.out.println("-----------");
        Book book2 = new Book() ;
        book2.a = 2 ;
        book2.show();
        System.out.println("-----------");
        Book.showb();
        System.out.println("現在的為：" + Book.b);
        book1.show();
        book2.show();
    }
    
}