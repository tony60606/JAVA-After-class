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
        
        cl c = new cl() ;
        c.test();
        c.test1(10);
        c.test2(15);
        System.out.println("---------------------");
        Interfacea in = new Interfacea(){
            @Override
            public void test() {
                System.out.println("匿名函數ˇ");
            }
        };
        in.test();
        System.out.println("---------------------");
        Interfacea s = () -> {System.out.println("lambda");} ;
        s.test();
    }
    
}
