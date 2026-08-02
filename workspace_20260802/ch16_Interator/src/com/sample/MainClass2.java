/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author ttoon
 */
public class MainClass2 {
    
    public static void main(String[] args) {
        
        HashSet<String> name = new HashSet() ;
        System.out.println(name.add("Alice"));
        System.out.println(name.add("Bob"));
        System.out.println(name.add("Alice"));
        System.out.println(name.add("Alice"));
        System.out.println(name.add("Carol"));
        System.out.println(name.add("Grace"));
        System.out.println(name.add("Irene"));
        System.out.println(name.add("David"));
        System.out.println(name.add("David"));
        
        System.out.println("------------------------------");
        System.out.println(name);
        System.out.println("------------------------------");
        
        TreeSet<String> name2 = new TreeSet() ;
        System.out.println(name2.add("Alice"));
        System.out.println(name2.add("Bob"));
        System.out.println(name2.add("Alice"));
        System.out.println(name2.add("Alice"));
        System.out.println(name2.add("Carol"));
        System.out.println(name2.add("Grace"));
        System.out.println(name2.add("Irene"));
        System.out.println(name2.add("David"));
        System.out.println(name2.add("David"));
        
        System.out.println("------------------------------");
        System.out.println(name2);
        System.out.println("------------------------------");
        
        
        
        
        
        
        
    }
    
}
