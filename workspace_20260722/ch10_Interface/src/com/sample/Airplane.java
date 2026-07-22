/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Airplane implements Fly  {
    
    private String name2 ;
    private int seat ;
    
    public Airplane(String name2){
        this.name2 = name2 ;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    

    @Override
    public void flying() {
        System.out.println("name：" + name2);
        System.out.println("a：" + a);
        System.out.println("可乘坐人數：" + seat);
        System.out.println("速度：" + Flyspeed.speed);
    }
}
