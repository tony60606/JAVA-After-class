/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        
        HashMap<String,data> book = new HashMap() ;
        book.put("A001", new data("射鵰英雄傳", 'L', 450)) ;
        book.put("B001", new data("神鵰俠侶", 'R', 480)) ;
        book.put("C001", new data("倚天屠龍記", 'H', 420)) ;
        book.put("D001", new data("天龍八部", 'D', 500)) ;
        Set<String> ID = book.keySet() ;
        for(var a : ID) {
            System.out.println("書本ID:" + a + "," + book.get(a));
        }
    }
    
}
