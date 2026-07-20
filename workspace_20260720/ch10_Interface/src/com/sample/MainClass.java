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
        Classification bird1 = new Classification() ;
        bird1.name = "綠繡眼" ;
        bird1.Flying();
        System.out.println("-------------------");
        bird bird2 = new Classification() ;
        bird2.Flying();
    }
    
}
