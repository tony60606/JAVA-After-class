/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sampie;

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
        String [] drink = {"black tea","Green tea","Milk tea","Juice","Hot chocolate"} ;
        System.out.println("drink：" + Arrays.toString(drink));
        for (int i = 0 ; i < drink.length ; i++) {
            System.out.println("drink["+i+"]="+ drink[i]);
        }
        System.out.println("------------------------------");
        int [] price = new int[5] ;
        System.out.println(Arrays.toString(price));
        price = new int[]{30,30,45,60,55} ;
        System.out.println(Arrays.toString(price));
        for(int A : price){
            System.out.println(A);
        }
        System.out.println("------------------------------");
        int [][] A2 = {{11,21,31},{111,222,333,4444},{123,1254,1166,147,555},{164,258,136,984,25,12}} ;
        System.out.println("A2 = " + Arrays.deepToString(A2));
        int a = 0 ;
        while (a < A2.length) {
            int b = 0 ;
            while (b < A2[a].length) {
                System.out.println("A2[" + a+ "][" + b +"]=" + A2[a][b]);
                b++ ;
            }
            a++ ;
        }
        System.out.println("------------------------------");
        int [][] A3 = new int[6][] ;
        System.out.println("A3 = " + Arrays.deepToString(A3));
        A3[0] = new int[5];
        A3[1] = new int[5];
        A3[2] = new int[6];
        A3[3] = new int[5];
        A3[4] = new int[4];
        A3[5] = new int[2];
        System.out.println("A3 = " + Arrays.deepToString(A3));
        System.out.println("------------------------------");
        int [][][] A4 = {{{123,234},{456,567}},{{147,258},{258,369}},{{159,357},{111,222}}} ;
        System.out.println("A4 = " + Arrays.deepToString(A4));
        System.out.println("------------------------------");
        String [][] A5 = {{"Apple", "Samsung", "Google", "Xiaomi", "OPPO", "Sony"},{"Standard", "Plus", "Pro"}} ;
        for (String [] phone : A5) {
            for (String level : phone) {
                System.out.printf("%s |",level);
            }
        }
        System.out.println();
        for (int c=0 ; c < A5[0].length; c++) {
            for(int d=0 ; d<A5[1].length ; d++){
                System.out.printf("手機品牌：%s%n",A5[0][c]);
                System.out.printf("手機等級：%s%n",A5[1][d]);
                System.out.println("---------------------------");
            }
        }
        System.out.println("------------------------------");
        System.out.println("A5[0][2]：" + A5[0][2]);
        System.out.println("A4[0][1][1]：" + A4[0][1][1]);
    }
    
}
