/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class Book {
    private int Length ;
    private int Width ;
    private int high ;
    private int radius ;
    public static final double PI  = 3.14 ;
    
    public void setLW (int Length , int Width) {
        this.Length = Length ;
        this.Width = Width ;
    }
    
    public void setH (int high) {
        this.high = high ;
    }
    
    public void setRadius (int radius) {
        this.radius = radius ;
    }
    
    public int getL() {
        return Length ;
    }
    
    public int getW() {
        return Width ;
    }
    
    public int getH() {
        return high ;
    }
    
    public int getR() {
        return radius ;
    }
    
    public int cuboid() {
    return Length * Width * high ; 
    }
    
    public double cylinder() {
    return radius * radius *  PI * high;
    }
}


