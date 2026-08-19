/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

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
        
        ExecutorService E1 = Executors.newCachedThreadPool() ;
        
        for(int i = 1 ; i<= 20 ; i++) {
            E1.execute(new Student());
        }
        
        E1.shutdown();
        
    }
    
}



class Student implements Runnable {
    
    private static int i = 0 ;
    private static AtomicInteger Ai = new AtomicInteger(1) ; 
    private static CyclicBarrier Cy = new CyclicBarrier(5) ;

    @Override
    public void run() {
        
        int num = Ai.getAndIncrement() ;
        
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("報到序號 : %02d \t %02d 號選手 \t %-20s就位%n",++i,num,Thread.currentThread().getName());
            Cy.await();
        } catch (InterruptedException |BrokenBarrierException ex) {
            System.out.println(ex);
        }
        
        
        System.out.printf("%02d 號選手 \t %-20s起跑%n",num,Thread.currentThread().getName());
        
        
    }

}
