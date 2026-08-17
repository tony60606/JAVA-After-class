/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

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
        
        ExecutorService E1 = Executors.newFixedThreadPool(5) ;
        
        for (int i = 1 ; i <= 20 ; i++) {
            E1.execute(new M3Thread(i));
        }
        
        E1.shutdown();
        
        
        
        
    }
    
}

class M3Thread implements Runnable {

    private int num ;
    
    public M3Thread(int num) {
        this.num = num ;
    }
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        //System.out.println("name = " + name);
        String Cr = name.substring(name.length()-1);
        int time = new Random().nextInt(5000);
        System.out.printf("請%02d號來賓到%s號櫃台辦理 : %d%n",num,Cr,time);
        
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        
    }
    
    
    
    
}
