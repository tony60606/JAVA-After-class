/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.time.LocalDateTime;

/**
 *
 * @author ttoon
 */
public class Book {
    public String name ;
    public int hour ;
    private LocalDateTime time ;
    
    public Book() {
        System.out.println("預約成功");
    }
    
    public void booking(){
        time = LocalDateTime.now();
        System.out.println("預約人姓名："+name);
        System.out.println("預約時數："+hour+"小時");
        System.out.println("系統時間："+time);
    }
}
