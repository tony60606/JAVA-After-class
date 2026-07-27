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
        Book book1 = new Book("JAVA",'J',700) ;
        System.out.println(book1);
        Book book2 = new Book("JAVA",'J',700) ;
        System.out.println(book2);
        Book book3 = book2 ;
        System.out.println(book3);
        System.out.println("---------------------------------");
        System.out.println("book1 == book2：" + (book1 == book2));
        System.out.println("book2 == book3：" + (book2 == book3));
        System.out.println("book3 == book1：" + (book3 == book1));
        System.out.println("---------------------------------");
        System.out.println("book1.equals(book2)：" + book1.equals(book2));
        System.out.println("book2.equals(book3)：" + book2.equals(book3));
        System.out.println("book3.equals(book1)：" + book3.equals(book1));
    }
    
}
