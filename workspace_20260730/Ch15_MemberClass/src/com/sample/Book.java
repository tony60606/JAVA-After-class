/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Book {
    
    private String name ;
    private char num ;
    
    public Book(String name,char num) {
        this.name = name ;
        this.num = num ;
    }
   
    
    public class Books {
        private int quantity ;
        private int price ;
        
        public Books(int quantity,int price){
            this.price = price ;
            this.quantity = quantity ;
        }
        
        public int tal() {
            return quantity * price ;
        }
        
        public void dotest(){
            System.out.println("書本名稱：" + name);
            System.out.println("書本編冊：" + num);
            System.out.println("購買數量：" + quantity);
            System.out.println("書本單價：" + price);
            System.out.println("總金額：" + tal());
        }
    }
    
    
}
