/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.Random;

/**
 *
 * @author ttoon
 */
public class MainClass {
    public static void main(String[] args) {
        
        M1Thread M1 = new M1Thread("tony") ;
        M1Thread M2 = new M1Thread("mary") ;
        M1Thread M3 = new M1Thread("andy") ;
        M1Thread M4 = new M1Thread("tom") ;
        M1Thread M5 = new M1Thread("summy") ;
        
        M1.start();
        M2.start();
        M3.start();
        M4.start();
        M5.start();
        
        try {
            M1.join();
            M2.join();
            M3.join();
            M4.join();
            M5.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
       
        
        System.out.println("列印完畢");
        
        
        
    }
    
    
    
}


class M1Thread extends Thread {

    private String name ;
    
    public M1Thread(String name) {
        this.name = name ;
    }

    
    @Override
    public void run() {
        name = name.toUpperCase() ;
        int time = new Random().nextInt(1234) ;
        
        for (int i = 1 ; i <= 3 ; i++){
            try {
                Thread.sleep(time);
                System.out.printf("執行續名稱 : %s , name : %s , 列印第 %d 次 %d %n",Thread.currentThread().getName(),name,i,time);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    

}