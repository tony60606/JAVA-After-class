/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Random;

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
        
        Company1 C1 = new Company1() ;
        
        Thread T1 = new Thread(C1,"A") ;
        Thread T2 = new Thread(C1,"B") ;
        Thread T3 = new Thread(C1,"C") ;
        Thread T4 = new Thread(C1,"D") ;
        
        T1.start();
        T2.start();
        T3.start();
        T4.start();
        
        try {
            T1.join();
            T2.join();
            T3.join();
            T4.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println("-------------------------");
        System.out.println("同步化區塊 Company1 balance = " + C1.balance);
        System.out.println("-------------------------");
        
        Company2 C2 = new Company2() ;
        
        Thread T5 = new Thread(C2,"A") ;
        Thread T6 = new Thread(C2,"B") ;
        Thread T7 = new Thread(C2,"C") ;
        Thread T8 = new Thread(C2,"D") ;
        
        T5.start();
        T6.start();
        T7.start();
        T8.start();
        
        try {
            T5.join();
            T6.join();
            T7.join();
            T8.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println("-------------------------");
        System.out.println("未同步化區塊 Company2 balance = " + C2.balance);
        
        
    }
    
}

class Company1 implements Runnable {

    int balance ;

    @Override
    public void run() {
        for(int i = 1 ; i <= 3 ; i++) {
            synchronized(this) {
                int temp = balance ;
                try {
                    Thread.sleep(new Random().nextInt(100));
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                temp += 100 ;
                balance = temp ;
                System.out.printf("%02d %s \sbalance : %d%n",i,Thread.currentThread().getName(),balance);
            }
        }
        
        
    }
        
}

class Company2 implements Runnable {

    int balance ;

    @Override
    public void run() {
        for(int i = 1 ; i <= 3 ; i++) {
            
            int temp = balance ;
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            temp += 100 ;
            balance = temp ;
            System.out.printf("%02d %s \sbalance : %d%n",i,Thread.currentThread().getName(),balance);
            
        }
        
        
    }
        
}