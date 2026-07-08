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
    public int a  ;
    public static int b ;
    
    public void show() {
        System.out.println("物件成員a的值為：" + a);
        System.out.println("類別成員b的值為：" + b);
    }
    
    public static void showb() {
        for(int i = 0 ; i < 15 ; i++){
            b += 1 ;
            System.out.println(b);
        }
    }
}
