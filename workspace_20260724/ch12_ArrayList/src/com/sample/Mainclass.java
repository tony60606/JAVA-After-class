/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;

/**
 *
 * @author ttoon
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList ar1 = new ArrayList() ;
        ar1.add("JAVA") ;
        ar1.add(123) ;
        ar1.add("JAVA") ;
        ar1.add(453) ;
        ar1.add("Python") ;
        System.out.println("ar1 = " + ar1);
        ar1.add(4, "C++");
        System.out.println("ar1 = " + ar1);
        for (int a = 0 ; a < ar1.size() ; a++) {
            System.out.println("ar1位置[" + a +"]的值是：" + ar1.get(a));
        }
        System.out.println(((String)ar1.get(2)).toLowerCase()) ;
        System.out.println("---------------------------------");
        ArrayList<String> ar2 = new ArrayList() ;
        ar2.add("Tom") ;
        ar2.add("Tom") ;
        ar2.add("Jerry") ;
        ar2.add("Jerry") ;
        ar2.add(new String(new char [] {'P','o','o','h'})) ;
        ar2.add(2, "Doraemon");
        System.out.println("ar2 = " + ar2);
        System.out.println("第一個出現Tom的位置在：" + ar2.indexOf("Tom"));
        
        if (ar2.indexOf("Jerry") != -1) {
            System.out.println(ar2.set(ar2.indexOf("Jerry"),ar2.get(ar2.indexOf("Jerry")).toUpperCase())) ;
            System.out.println(ar2);
        }
        
        ar2.remove("Tom") ;
        ar2.remove(3) ; 
        System.out.println(ar2.remove(2));
        System.out.println(ar2);
        
        for (var b : ar2) {
            System.out.println(b);
        }
        
        ar2.clear();
        System.out.println("ar2現在是否是空集合：" + ar2.isEmpty()) ;
        System.out.println(ar2);
    }
    
}
