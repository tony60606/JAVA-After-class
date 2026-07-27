/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;

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
        String [] name = {"Cat","Dog","Cat","Cat","Dog","Lion","Lion"} ;
        ArrayList<String> animal = new ArrayList(Arrays.asList(name)) ;
        animal.add("Sheep") ;
        System.out.println("animal ：" + animal);
        animal.replaceAll(a -> a.toUpperCase());
        System.out.println("animal ：" + animal);
        animal.replaceAll(a -> a.toLowerCase());
        System.out.println("animal ：" + animal);
        animal.removeIf(a -> a.startsWith("c")) ;
        System.out.println("animal ：" + animal);
        animal.removeIf(a -> a.length() < 4 ) ;
        System.out.println("animal ：" + animal);
        System.out.println("---------------------------");
        Integer [] num = {14,55,32,66,87,11,15,62} ;
        ArrayList<Integer> age = new ArrayList(Arrays.asList(num)) ;
        System.out.println("age ：" + age);
        age.forEach(i -> {if(i >= 18) {System.out.printf("年齡為%d,已成年%n",i);} else {System.out.printf("年齡為%d,未成年%n",i);}} ) ;
        
    }
    
}
