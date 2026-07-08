/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.time.LocalDate;

/**
 *
 * @author ttoon
 */
public class Book {
    public String ID ;
    public String product ;
    public int price ;
    public int quantity ;
    public int total ;
    public int fintotal ;
    private int cost ;
    private int profit ;
    private LocalDate date = LocalDate.now() ;
    
    
    public Book() {
        System.out.println("---無參數建構子建立成功----");
    }
    
    public Book(String ID,String product,int price, int quantity){
        booking(ID,product,price,quantity) ;
    }
    
    
    public void bookstore() {
        this.profit = fintotal - (cost *quantity) ;
        System.out.println("產品編號：" + ID);
        System.out.println("產品名稱：" + product);
        System.out.println("產品價格：" + price);
        System.out.println("購買數量：" + quantity);
        System.out.println("總金額：" + total);
        System.out.println("折扣後金額：" + fintotal);
        System.out.println("產品成本：" + cost);
        System.out.println("產品利潤：" + profit);
        System.out.println("購買日期：" + date);
    }
    
    
    
    
    public int getcost(int c) {
        this.cost = c ;
        return c ;
    }
    
    public void booking(String ID,String product,int price,int quantity){
        this.ID = ID ;
        this.product = product ;
        this.price = price ;
        this.quantity = quantity ;
        this.total = price * quantity ;
        if (total >= 3000) {
            this.fintotal = (int) (total * 0.8) ;
        } else if (total >= 1500 & total < 3000) {
            this.fintotal = (int) (total * 0.9) ;
        } else {
            this.fintotal = total ;
        }
        
    
    
    }
    
}
