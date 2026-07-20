/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public abstract class Shop {
    
    private String name ;
    private String phone ;
    
    public Shop(){
        System.out.println("父類別無參數建構子");
    }
    
    public Shop(String name, String phone){
        System.out.println("Shop父類別有參數建構子.....");
        this.name = name ;
        this.phone = phone ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void book() {
        System.out.println("訂位人姓名：" + name + "先生/小姐");
        System.out.println("訂位人電話：" + phone);
    }
    
    public abstract int total() ;
    
}
