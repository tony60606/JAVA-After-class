/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
        
        Product p1 = new Product.Build().show() ;
        System.out.println("p1 : \n" + p1);
        
        List<Product> list = Product.create() ;
        System.out.println("list : \n" + list);
        
        System.out.println("-----------------------------");
        System.out.println("Consumer寫法 1 ");
        Consumer<Product> p2 = s -> System.out.println(s);
        list.forEach(p2);
        System.out.println("-----------------------------");
        System.out.println("Consumer寫法 2 ");
        list.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------");
        System.out.println("Predicate寫法 1 ");
        Predicate<Product> p3 = s -> s.getPrice() >= 50 ;
        list.stream().filter(p3).forEach(System.out :: println);
        System.out.println("-----------------------------");
        System.out.println("Predicate寫法 2 ");
        list.stream().filter(s -> s.getPrice() >=70).forEach(System.out :: println);
        System.out.println("-----------------------------");
        System.out.println("Function寫法");
        Function<Product , String> p4 = s -> s.getName() ;
        list.stream().map(p4).forEach(s -> System.out.printf("%s |",s));
        System.out.println("-----------------------------");
        System.out.println("Supplier寫法");
        Supplier<Product> p5 = () -> new Product.Build().show() ;
        System.out.println(p5.get());
    }
    
}
