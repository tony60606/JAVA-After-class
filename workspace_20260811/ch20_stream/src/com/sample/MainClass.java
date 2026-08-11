/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;


import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

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
        
        System.out.println("stream新增資料1 : Arrays.asList()");
        
        Stream<Integer> s1 = Arrays.asList(11,101,12,102,301,400,5,3).stream() ;
        s1.forEach(s -> System.out.printf("%s | " ,s));
        System.out.println("\n--------------------------");
        System.out.println("stream新增資料2 : Stream.of");
        Stream<Integer> s2 = Stream.of(11,101,12,102,301,400,5,3) ;
        long count1 = s2.count() ;
        System.out.println("s2個數 : " + count1);
        System.out.println("\n--------------------------");
        System.out.println("stream新增資料3 : Array.stream");
        Stream<Double> s3 = Arrays.stream(new Double[] {3.14,6.5,12.75,8.2,45.68,23.4,7.99,16.25}) ;
        System.out.println("s3總和 : " + s3.mapToDouble(s -> s).sum()) ;
        System.out.println("\n--------------------------");
        System.out.println("stream新增資料4 : Array.stream");
        DoubleStream s4 =Arrays.stream(new double [] {3.14,6.5,12.75,8.2,45.68,23.4,7.99,16.25}) ;
        System.out.println("s4總和 : " + s4.sum());
        System.out.println("\n--------------------------");
        System.out.println("把stream中的字串數字部分取出算平均");
        System.out.println("寫法 1 ");
        Stream<String> s5 = Stream.of("A123","B45","C7890","D12","E456","F9999") ;
        OptionalDouble avg1 = s5.map(s -> s.substring(1)).mapToInt(s -> Integer.parseInt(s)).average() ;
        System.out.println("s5的平均值為 : " + avg1.getAsDouble());
        System.out.println("\n--------------------------");
        System.out.println("寫法 2 ");
        double avg2 = Stream.of("A123","B45","C7890","D12","E456","F9999").map(s -> s.substring(1)).mapToInt(s -> Integer.parseInt(s)).average().getAsDouble() ;
        System.out.println("Stream.of(\"A123\",\"B45\",\"C7890\",\"D12\",\"E456\",\"F9999\")平均值 : " + avg2);
    }
    
}
