/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Arrays;

/**
 *
 * @author ttoon
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        var sum = 0 ;
        
        for(var i = 0 ; i <=15 ; i++) {
            sum += i ;
        }
        System.out.println("sum = " + sum);
        
        var age = new int[] {30,45,11,15,20} ;
        System.out.println(Arrays.toString(age));
    }
    
}
