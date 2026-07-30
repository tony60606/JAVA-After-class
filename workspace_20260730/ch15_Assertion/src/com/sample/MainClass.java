/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Scanner;

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
        System.out.println("請輸入一個正整數：");
        Scanner sca = new Scanner(System.in) ;
        int a = sca.nextInt() ;
        dotest(a);
        
    }

    private static void dotest(int a) {
        
        
        if (a > 0 ) {
            System.out.println("您輸入的正整數為：" + a);
        } else if (a == 0) {
            System.out.println("您輸入的正整數為：" + a);
        } else {
            assert a >= 0 : "輸入錯誤" ;
        }
    }
    
}
