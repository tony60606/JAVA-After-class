/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.io.Serializable;

/**
 *
 * @author ttoon
 */
public class kid implements Serializable {
    
    private static long seriaVersionUID = 1L ;
    
    private transient String name ;
    private int sum ;
    private double avg ;

    public kid(String name) {
        this.name = name;
    }
    
    public void col(int... score) {
        if (score.length >0) {
            for(int i : score) {
                sum += i ;
            }
            avg = (double) sum / score.length ;
        } else {
            sum = 0 ;
            avg = 0.0 ;
        }
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return "name=" + name + ", sum=" + sum + ", avg=" + avg ;
    }
    
    
    
    
}
