/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
        
        ExecutorService E2 = Executors.newCachedThreadPool() ;
        
        Future<Set> F1 = E2.submit(new Lotto("F1")) ;
        Future<Set> F2 = E2.submit(new Lotto("F2")) ;
        Future<Set> F3 = E2.submit(new Lotto("F3")) ;
        
        
        try {
            System.out.println("F1 = " + F1.get());
            System.out.println("F2 = " + F2.get());
            System.out.println("F3 = " + F3.get());
        } catch(Exception ex) {
            System.out.println(ex);
        }
        
        E2.shutdown();
        
    }


}



class Lotto implements Callable<Set> {
       
    private String name ;
    
    public Lotto(String name) {
        this.name = name ;
    }

    @Override
    public Set call() throws Exception {
        Set<Integer> lotto = new TreeSet() ;
        Random r1 = new Random();
        while (lotto.size() < 6) {
            Thread.sleep(r1.nextInt(2000));
            int num = r1.nextInt(64)+1 ;
            System.out.printf("name = %s \t %02d \t %b%n",name,num,lotto.add(num));
        } 
        return lotto ;
    }

    
    
    
    
}
