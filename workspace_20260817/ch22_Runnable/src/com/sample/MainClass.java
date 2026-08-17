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
        
        M2Thread m1 = new M2Thread("C") ;
        M2Thread m2 = new M2Thread("D") ;
        
        Thread t1 = new Thread(m1) ;
        Thread t2 = new Thread(m2) ;
        
        t1.start();
        t2.start();
        
        
    }
    
}

class M2Thread implements Runnable {
    
    
    private String name ;
    
    public M2Thread(String name) {
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
