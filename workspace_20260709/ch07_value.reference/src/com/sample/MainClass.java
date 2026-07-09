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
        //傳值：基本型別
        int a = 1 ;
        int b = a ;
        System.out.println("----(1)----");
        System.out.println("a的值：" + a);
        System.out.println("b的值：" + b);
        a = a + 1 ;
        System.out.println("----(2)----");
        System.out.println("a的值：" + a);
        System.out.println("b的值：" + b);//a的值copy給b，兩者記憶體位址不同，a改變b不會改變
        dotest(a) ; //把a的值丟給dotest方法
        System.out.println("----(4)----");
        System.out.println("a的值：" + a);//跟方法的a為不同區域變數
        System.out.println("b的值：" + b);
        System.out.println("--------------");
        //傳址：參考型別
        Book book1 = new Book() ;
        book1.c = 1 ;
        book1.d  = book1.c ;
        book1.book();
        book1.dotest();
        Book book2 = book1 ;
        book2.c = book2.c + 1 ;
        book2.d = book2.c ;
        book1.book();
        book1.dotest();
        book2.book();
        book2.dotest();
        System.out.println("--------------");
        String str = "Java" ;
        System.out.println("str = " + str);
        System.out.println("--------------");
        dotest(str) ;//把str的值丟給dotest方法
        System.out.println("--------------");
        System.out.println("str = " + str); //String資料不可變
        
        
    }
    
    private static void dotest(int a) {
        a = a + 1 ;
        System.out.println("----(3)----");
        System.out.println("a的值：" + a);
        
    }
    
    private static void dotest(String str){
        str = str.toUpperCase() ;
        System.out.println("str = " + str);  
    }
    
    
}
