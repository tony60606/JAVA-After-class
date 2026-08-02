/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<String> name = new ArrayList() ;
        name.add("Alice") ;
        name.add("Bob") ;
        name.add("Alice") ;
        name.add("Alice") ;
        name.add("Carol") ;
        name.add("Grace") ;
        name.add("Irene") ;
        name.add("David") ;
        name.add("David") ;
        
        Iterator Name = name.iterator() ;
        while (Name.hasNext()) {
            System.out.print(Name.next() + "|");
        }
        System.out.println("\n----------------------------");
        
    }
    
}
