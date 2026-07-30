/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
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
        
        try (FileInputStream fis = new FileInputStream("text.txt")) {
            MainClass2 in = new MainClass2("Hallo") ;
            in.Msg();
            dotest() ;
            fis.read() ;
        } catch (InputMismatchException|ArithmeticException|IOException ex) {
            System.out.println("main()：" + ex.getMessage());
        } 
        
    }

    private static void dotest() {
        System.out.println("請輸入一個整數 a ：");
        Scanner sca = new Scanner(System.in) ;
        int a = sca.nextInt() ;
        System.out.println("請輸入一個整數 b ：");
        int b = sca.nextInt() ;
        int cal = a / b ;
        System.out.println(cal);
        
    } 
    
}

class MainClass2{
    private String msg ;
    
    public MainClass2(String msg) {
        this.msg = msg ;
    }
    
    public void Msg() {
        System.out.println(msg);
    }
    
    
}