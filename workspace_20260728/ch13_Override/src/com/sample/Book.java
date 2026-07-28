/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.Objects;

/**
 *
 * @author ttoon
 */
public class Book {
    private String name ;
    private char num ;
    private int price ;
    
    public Book(String name,char num,int price) {
        this.name = name ;
        this.num = num ;
        this.price = price ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getNum() {
        return num;
    }

    public void setNum(char num) {
        this.num = num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name：" + name + "\nnum：" + num + "\nprice：" + price ;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 43 * hash + Objects.hashCode(this.name);
//        hash = 43 * hash + this.num;
//        hash = 43 * hash + this.price;
//        return hash;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.num != other.num) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
    
    
    
}
