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
        
        M1Thread m1 = new M1Thread("A") ;
        M1Thread m2 = new M1Thread("B") ;
        
        m1.start();
        m2.start();
        
    }
    
}


class M1Thread extends Thread {
    
    private String name ;
    
    public M1Thread(String name) {
        this.name = name ;
    } 
    
    @Override
    public void run() {
        Thread M1 = Thread.currentThread();
        for (int i = 1 ; i <= 15 ; i++) {
            System.out.printf("%s,%s,執行了%d次%n",M1,name,i);
        }
    }
    
}
