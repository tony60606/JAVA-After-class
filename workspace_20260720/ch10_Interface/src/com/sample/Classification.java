/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Classification implements bird {
    public String name ;

    @Override
    public void Flying() {
        System.out.println("分類：" + Race);
        System.out.println("name ："  + name);
    }
}
