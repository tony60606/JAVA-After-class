/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ttoon
 */
public class MainClass2  {
    public static void main(String[] args) {
        
        ArrayList<data> book = new ArrayList() ;
        book.add(new data("射鵰英雄傳", 'L', 450)) ;
        book.add(new data("神鵰俠侶", 'R', 480)) ;
        book.add(new data("倚天屠龍記", 'H', 420)) ;
        book.add(new data("天龍八部", 'D', 500)) ;
        book.sort(new bookorder());
        for(var a : book) {
            System.out.println(a);
        }
        System.out.println("------------------");
        book.sort(new bookvalue());
        for(var b : book) {
            System.out.println(b);
        }
        
        
    }
    
    private static class bookorder implements Comparator<data> {

    @Override
    public int compare(data o1, data o2) {
        return Character.valueOf(o1.getBookmark()).compareTo(o2.getBookmark()) ;
    }
    


    }
    
}


