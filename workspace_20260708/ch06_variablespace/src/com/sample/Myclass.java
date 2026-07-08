/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Myclass {
    public String item ;
    
    public void show(String it) {
        System.out.println("it = " + it);
        String temp = "項目：" + it ;
        System.out.println("temp = " + temp);
        item = "工作：" + temp ;
        System.out.println("item = " + item);
    }
    
    public String showall(){
        String temp = "Python" ;
        return temp ;
    }
}
