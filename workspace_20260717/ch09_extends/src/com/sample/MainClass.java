/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

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
        Meal meal1 = new Meal() ;
        meal1.setName("王");
        meal1.setPhone("0912345678");
        meal1.book();
        meal1.setMealName("蛋包飯");
        meal1.setQuantity(2);
        meal1.setPrice(90);
        meal1.ordermeal();
        System.out.println("------------------");
        Drink drink1 = new Drink() ;
        drink1.setName("張");
        drink1.setPhone("0923456789");
        drink1.setDrinkname("雙Q奶茶");
        drink1.setQuantity2(4);
        drink1.setPrice2(65);
        drink1.book();
        System.out.println("-------------------");
        System.out.println("餐點訂單總額：" + meal1.total());
        System.out.println("飲料訂單總額：" + drink1.total());
        
    }
    
}
