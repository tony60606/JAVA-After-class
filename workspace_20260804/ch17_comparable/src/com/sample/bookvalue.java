/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.Comparator;

/**
 *
 * @author ttoon
 */
public class bookvalue implements Comparator<data> {

    @Override
    public int compare(data o1, data o2) {
        return o1.getBookname().compareTo(o2.getBookname()) ;
    }
    
}
