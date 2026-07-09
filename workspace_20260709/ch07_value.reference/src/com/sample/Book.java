/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Book {
    int c ;
    int d ;
    
    
    public void book(){
        System.out.println("----(1)----");
        System.out.println("c的值：" + c);
        System.out.println("d的值：" + d);
    }
    
    public void dotest(){
        c = c + 1 ;
        System.out.println("----(2)----");
        System.out.println("c的值：" + c);
        System.out.println("d的值：" + d);
    }
}
