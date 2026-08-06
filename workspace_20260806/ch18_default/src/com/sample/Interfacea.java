/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */

@FunctionalInterface
public interface Interfacea {
    
    void test() ;
    
    public default void test1(int i) {
        System.out.println("test1方法 : " + i );
    }
    
    public default void test2(int i) {
        System.out.println("test2方法 : " + i );
        display(i) ;
    }
    
    private void display(int i) {
        for(int a = i ; a < 100 ; a+=15) {
            System.out.println(a);
        }
    }
    
}
