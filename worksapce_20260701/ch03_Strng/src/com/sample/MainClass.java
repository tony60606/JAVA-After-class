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
        char A1 = 'C' ;
        String A2 = "AB" ;
        System.out.println(A1 + A2);
        System.out.println("----------------------");
        String A3 = "JAVA" ;
        String A4 = "JAVA" ;
        String A5 = "Java" ;
        System.out.println("A3=" + A3);
        System.out.println("A4=" + A4);
        System.out.println("A5=" + A5);
        System.out.println("A3記憶體位址：" + System.identityHashCode(A3));
        System.out.println("A4記憶體位址：" + System.identityHashCode(A4));
        System.out.println("A5記憶體位址：" + System.identityHashCode(A5));
        System.out.println("A3==A4? ：" + (A3 == A4));
        System.out.println("A3==A5? ：" + (A3 == A5));
        System.out.println("A3.A4內容是否相同?：" + A3.equals(A4));
        System.out.println("A3.A5內容是否相同?：" + A3.equals(A5));
        System.out.println("----------------------");
        String A6 = new String("JAVA") ;
        System.out.println("A6=" + A6);
        System.out.println("A6記憶體位址：" + System.identityHashCode(A6));
        System.out.println("A3==A6? ：" + (A3 == A6));
        System.out.println("A3.A6內容是否相同?：" + A3.equals(A6));
        System.out.println("----------------------");
        String A7 = "ABC" ;
        String A8 = "CBA" ;
        A7.concat(A8) ;
        System.out.println("A7=" + A7);
        System.out.println("A8=" + A8);
        A7 = A7.concat(A8) ;
        System.out.println("A7=" + A7);
        System.out.println("A8=" + A8);
        System.out.println("----------------------");
        String A9 = " Money money money Must be funny In the rich man world " ; 
        System.out.println(A9.length());
        System.out.println(A9.trim());
        System.out.println(A9.toUpperCase());
        System.out.println(A9.toLowerCase());
        A9 = A9.trim() ;
        System.out.println(A9.startsWith("Mo"));
        System.out.println(A9.endsWith("d"));
        System.out.println(A9.charAt(15));
        System.out.println(A9.substring(10, 18));
        System.out.println(A9.substring(19));
        System.out.println(A9.indexOf("ne"));
        System.out.println(A9.indexOf("on", 6));
        System.out.println(A9.lastIndexOf("he"));
        System.out.println("----------------------");
        StringBuilder A10 = new StringBuilder() ;
        A10.append("Python") ;
        System.out.println(A10);
        A10.append(" 13").append(" JAVA") ;
        System.out.println(A10);
        A10.insert(6, "ABC") ;
        System.out.println(A10);
        A10.delete(8, 12) ;
        System.out.println(A10);
        System.out.println("----------------------");
        String Sw = "92.85" ;
        String Sh = "180" ;
        double w = Double.parseDouble(Sw) ;
        int h = Integer.parseInt(Sh) ;
        double BMI = w / ((h/100.0)*(h/100.0)) ;
        System.out.printf("體重：%.0f公斤，身高：%d公分，BMI為%.2f%n",w,h,BMI);
    }
    
}
