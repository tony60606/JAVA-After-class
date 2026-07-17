/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Meal extends Shop{
    
    private String mealname ;
    private int quantity ;
    private int price ;
    
    public Meal() {
       System.out.println("Meal子類別無參數建構子");
    }

    public String getMealName() {
        return mealname;
    }

    public void setMealName(String mealname) {
        this.mealname = mealname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void ordermeal() {
        System.out.println("餐點名稱：" + mealname);
        System.out.println("餐點份數：" + quantity + "份");
        System.out.println("餐點單價：" + price);
    }
    
    public int total() {
        return quantity * price ;
    }
}
