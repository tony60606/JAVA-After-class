/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayDeque;
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
        ArrayDeque<String> meal = new ArrayDeque() ;
        meal.add("Hamburger") ;
        meal.add("Sandwich") ;
        meal.add("Hamburger") ;
        meal.add("Pizza") ;
        meal.add("Pizza") ;
        meal.add("Pasta") ;
        meal.add("Sandwich") ;
        System.out.println(meal);
        
        while (!meal.isEmpty()) {
            meal.remove() ;
            System.out.println(meal);
        }
        
        System.out.println("-------------------------------");
        ArrayDeque<String> drink = new ArrayDeque() ;
        drink.push("Coffee");
        drink.push("Tea");
        drink.push("Coffee");
        drink.push("Coffee");
        drink.push("Juice");
        drink.push("Tea");
        drink.push("Coffee");
        drink.push("Milkshake");
        drink.push("Tea");
        
        while (!drink.isEmpty()) {
            drink.pop() ;
            System.out.println(drink);
        }
        
    }
    
}
