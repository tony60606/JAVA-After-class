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
        
        Student s1 = new Student.Build().get() ;
        System.out.println("s1 : " + s1);
        System.out.println("---------------------");
        Student s2 = new Student.Build().Num('A').Name("吳@@").Classnum("A001").Age(28).get() ;
        System.out.println("s2 : " + s2);
        
    }
    
}
