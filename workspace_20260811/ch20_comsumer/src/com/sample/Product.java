/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ttoon
 */
public class Product {
    
    private String ID ;
    private String name ;
    private String category ;
    private String capacity ;
    private int quantity ;
    private int price ;
    
    public static class Build {
    
        private String ID = " ";
        private String name = " ";
        private String category = " ";
        private String capacity = " ";
        private int quantity = 0;
        private int price = 0;
    
        public Product.Build ID(String ID) {
            this.ID = ID ;
            return this ;
        }
    
        public Product.Build Name(String name){
            this.name = name ;
            return this ;
        }
    
        public Product.Build Category(String category){
            this.category = category ;
            return this ;
        }
    
        public Product.Build Capacity(String capacity){
            this.capacity = capacity ;
            return this ;
        }
    
        public Product.Build Quantity(int quantity){
            this.quantity = quantity ;
            return this ;
        }
    
        public Product.Build PRice(int price){
            this.price = price ;
            return this ;
        }
    
        public Product show() {
            return new Product(this) ;
        } 
    
    }
    
    private Product (Build build) {
        this.ID = build.ID ;
        this.name = build.name ;
        this.category = build.category ;
        this.capacity = build.capacity ;
        this.quantity = build.quantity ;
        this.price = build.price ;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
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
    
    private int total() {
        return this.quantity * this.price ;
    }

    @Override
    public String toString() {
        return "產品編號 : " + ID +
                "\n產品名稱 : " + name +
                "\n產品類別 : " + category + "類" + 
                "\n產品規格 : " + capacity +
                "\n購買數量 : " + quantity +
                "\n產品單價 : " + price +
                "\n購買金額 : " + total() +
                "\n------------------------------\n";
    }
    
    public static List<com.sample.Product> create() {
        List<com.sample.Product> list = new ArrayList() ;
        list.add(new com.sample.Product.Build()
                .ID("C001")
                .Name("水果軟糖")
                .Category("軟糖")
                .Capacity("20顆裝")
                .Quantity(10)
                .PRice(60).show());

        list.add(new com.sample.Product.Build()
                .ID("C002")
                .Name("牛奶糖")
                .Category("太妃糖")
                .Capacity("15顆裝")
                .Quantity(8)
                .PRice(50).show());

        list.add(new com.sample.Product.Build()
                .ID("C003")
                .Name("巧克力糖")
                .Category("巧克力")
                .Capacity("12顆裝")
                .Quantity(15)
                .PRice(80).show());

        list.add(new com.sample.Product.Build()
                .ID("C004")
                .Name("薄荷糖")
                .Category("硬糖")
                .Capacity("30顆裝")
                .Quantity(20)
                .PRice(45).show());

        list.add(new com.sample.Product.Build()
                .ID("C005")
                .Name("棒棒糖")
                .Category("棒棒糖")
                .Capacity("10顆裝")
                .Quantity(12)
                .PRice(70).show());

        list.add(new com.sample.Product.Build()
                .ID("C006")
                .Name("咖啡糖")
                .Category("硬糖")
                .Capacity("25顆裝")
                .Quantity(6)
                .PRice(55).show());
        
        return list ;
    }
    
}
