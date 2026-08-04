/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.entry;

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
        
        List<String> boy1 = List.of("王小明", "李雅婷", "陳志豪", "王小明") ;
        System.out.println(boy1);
        System.out.println("-----------------------------------");
        String [] name = {"林怡君", "張家豪", "陳美玲", "李雅婷", "王小明", "林怡君", "黃俊傑", "張家豪", "吳佩珊", "陳美玲", "劉冠廷", "王小明"} ;
        List<String> boy2 = List.of(name) ;
        System.out.println(boy2);
        System.out.println("-----------------------------------");
        Set<String> woman1 = Set.of("趙子晴", "周柏宇", "徐婉婷", "鄭凱文") ;
        System.out.println(woman1);
        System.out.println("-----------------------------------");
        String [] name2 = {"蔡佳穎", "楊承翰", "許庭瑜", "郭彥廷", "何欣怡", "高宇翔", "宋雨潔", "潘冠宇", "杜思涵", "曾柏勳", "葉佳蓉", "蘇建宏"} ;
        Set<String> woman2 = Set.of(name2) ;
        System.out.println(woman2);
        System.out.println("-----------------------------------");
        Map<String,String> human = Map.of("A01", "王小明", "A02", "李雅婷", "A03", "陳志豪", "A04", "林怡君", "A05", "張家豪", "A06", "陳美玲") ;
        System.out.println(human);
        System.out.println("-----------------------------------");
        Map<String,String> human2 = Map.ofEntries(
                Map.entry("B01", "黃俊傑") ,
                entry("B02", "吳佩珊"),
                entry("B03", "劉冠廷"),
                entry("B04", "趙子晴"),
                entry("B05", "周柏宇"),
                entry("B06", "徐婉婷"),
                entry("B07", "鄭凱文"),
                entry("B08", "蔡佳穎"),
                entry("B09", "楊承翰"),
                entry("B10", "許庭瑜"),
                entry("B11", "郭彥廷")
        );
        System.out.println(human2);
        
    }
    
}
