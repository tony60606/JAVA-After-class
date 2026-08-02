/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.time.Month;
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
        // TODO code application logic here
        System.out.println(Dept.Finance);
        System.out.println(Arrays.toString(Dept.values()));
        System.out.println(Arrays.toString(Month.values()));
        
        for(var a : Dept.values()) {
            System.out.println(a.ordinal() + "." + a);
        }
    }
    
}
