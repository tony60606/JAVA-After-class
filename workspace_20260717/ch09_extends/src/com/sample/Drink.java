/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Drink extends Shop{
    
    private String drinkname ;
    private int quantity2 ;
    private int price2 ;
    
    public Drink() {
        System.out.println("Drink子類別無參數建構子");
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname;
    }

    public int getQuantity2() {
        return quantity2;
    }

    public void setQuantity2(int quantity2) {
        this.quantity2 = quantity2;
    }

    public int getPrice2() {
        return price2;
    }

    public void setPrice2(int price2) {
        this.price2 = price2;
    }

    @Override
    public void book() {
        super.book(); 
        System.out.println("飲料名稱：" + drinkname);
        System.out.println("飲料杯數：" + quantity2 + "份");
        System.out.println("飲料單價：" + price2);
    }
    
    public int total() {
        return quantity2 * price2 ;
    }
    
}
