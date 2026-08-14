/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
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
        
        Stream<String> english = Stream.of("cat", "adventure", "sun", "chocolate", "book", "electricity", "tree", "information")
                                 .peek(s -> System.out.println("1." + s))
                                 .filter(s -> s.length() >5)
                                 .peek(s -> System.out.println("2." + s))
                                 .map(s -> s.toUpperCase())
                                 .peek(s -> System.out.println("3." + s)) ;
        
        //因沒有終端操作，執行並不會顯示任何資料
        //english.forEach(s -> System.out.println("4." + s));
                
        //計算有跑到終端操作的資料個數
        //long count1 = english.count() ;
        //System.out.println("跑到終端操作的資料個數 : " + count1);       
                
        //將有跑到終端操作的資料個數轉成List
        //List<String> english1 = english.collect(Collectors.toList()) ;
        //System.out.println("english1 = " + english1);;
        
        //將有跑到終端操作的資料個數用" "中的符號串聯
        //String english2 = english.collect(Collectors.joining(" - ")) ;
        //System.out.println("english2 = " + english2);
        
        //將資料轉成List,自然排序
        List<String> english3 = Arrays.asList("cat", "adventure", "sun", "chocolate", "book", "electricity", "tree", "information") ;
        english3.stream().sorted().forEach(s -> System.out.printf("%s | ",s));
        System.out.println("\n-------------------------");
        
        //將資料轉成List,自訂排序(昇冪)
        List<String> english4 = Arrays.asList("cat", "adventure", "sun", "chocolate", "book", "electricity", "tree", "information") ;
        english4.stream().sorted((O1,O2) -> O1.compareTo(O2)).forEach(s -> System.out.printf("%s | ",s));
        System.out.println("\n-------------------------");
        
        //將資料轉成List,自訂排序(降冪)
        List<String> english5 = Arrays.asList("cat", "adventure", "sun", "chocolate", "book", "electricity", "tree", "information") ;
        english5.stream().sorted((o1,o2) -> o1.compareTo(o2)*-1).forEach(s -> System.out.printf("%s | ",s));
        System.out.println("\n-----------------------------");
        
        List<Rule> student = List.of( new Rule(30 , "許OO") ,
                                      new Rule(45 , "林OO") ,
                                      new Rule(18 , "董OO") ,
                                      new Rule(37 , "洪OO") ,
                                      new Rule(18 , "鄭OO") ,
                                      new Rule(45 , "陳OO") 
                                    ) ;
        Comparator<Rule> rule = Comparator.comparing(Rule :: getAge).thenComparing(Rule :: getName) ;
        student.stream().sorted(rule).forEach(System.out :: println);
        System.out.println("---------------------------");
        Comparator<Rule> rule2 = Comparator.comparing(Rule :: getAge).thenComparing(Rule :: getName).reversed() ;
        student.stream().sorted(rule2).forEach(System.out :: println);
        
        
        //二維陣列轉一維陣列
        List<Integer> n1 = List.of(12, 47, 83) ;
        List<Integer> n2 = List.of(5, 29, 61, 94, 138) ;
        List<Integer> n3 = List.of(17, 36) ;
        List<Integer> n4 = List.of(8, 52, 76, 101) ;
        List<Integer> n5 = List.of(23, 44, 69, 87, 125, 160) ;
        
        List<List<Integer>> num = List.of(n1,n2,n3,n4,n5) ;
        System.out.println("num = " + num);
                
        //方法一 : 雙層for迴圈
        List<Integer> num2 = new ArrayList() ;
        for (List<Integer> a : num) {
            for (int b : a) {
                num2.add(b) ;
            }
        }
        System.out.println("num2 : " + num2);    
        
        //方法二 : 攤平
        List<Integer> num3 = num.stream().flatMap(s -> s.stream()).sorted().collect(Collectors.toList()) ;
        System.out.println("num3 : " + num3); 
        
        
        //找出符合條件的資料,並轉成List
        List<Integer> num4 = List.of(47, 12, 83, 29, 47, 6, 91, 35, 12, 68, 54, 83, 21, 76, 35, 9, 62, 47, 18, 90) ;
        
        List<Integer> odd = num4.stream().filter(s -> s % 2 != 0).collect(Collectors.toList()) ;
        System.out.println("odd = " + odd);
        
        //找出符合條件的資料,並轉成Set
        Set<Integer> even = num4.stream().filter(s -> s % 2 == 0).collect(Collectors.toSet()) ;
        System.out.println("even = " + even);
        
        //找出符合條件的資料,並轉成Map,分組顯示重複數字
        Map<Integer , Long> odd2 = num4.stream().filter(s -> s > 30).collect(Collectors.groupingBy(s -> s,Collectors.counting())) ;
        System.out.println("odd2 = " + odd2);
        
        //顯示數字及該數平方數
        Map<String , Integer> num5 = Stream.of(47, 12, 83, 29, 65, 91).collect(Collectors.toMap(s -> String.valueOf(s), s -> s * s)) ;
        System.out.println("num5 = " + num5);
        
        //顯示數字及該數平方數(排序)
        Map<String , Integer> num6 = Stream.of(47, 12, 83, 29, 65, 91).collect(Collectors.toMap(s -> String.valueOf(s), s -> s * s , (s1,s2) -> s1 , TreeMap :: new)) ;
        System.out.println("num6 = " + num6);
    }
    
}
