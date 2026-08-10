/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Optional;

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
        Optional in = Optional.ofNullable(get(1)) ;
        in.ifPresentOrElse( s -> System.out.println(s), 
                            () -> System.out.println("null"));
        
    }
    
    
    private static String get(int i) {
    
        if (i == 0) {
            return null ;
        } else {
            return "i" ;
        }
    
    }
    
}
