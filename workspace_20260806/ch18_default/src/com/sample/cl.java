/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class cl implements Interfacea , Interfaceb {

    @Override
    public void test() {
        System.out.println("抽象方法實作");
        
        
        
    }

    @Override
    public void test1(int i) {
        Interfacea.super.test1(i);
        for(int a = i ; a < 100 ; a+=15) {
            System.out.println(a);
        }
    }

    @Override
    public void test2(int i) {
        Interfacea.super.test2(i);
        System.out.println("---------------");
        Interfaceb.super.test2(i); 
    }
    
    
    
    
}
