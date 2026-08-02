/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author ttoon
 */
public class MainClass3 {
    public static void main(String[] args) {
        
        HashMap<String,String> name = new HashMap() ; 
        System.out.println(name.put("A03","Alice"));
        System.out.println(name.put("V02","Bob"));
        System.out.println(name.put("C01","Alice"));
        System.out.println(name.put("A05","Alice"));
        System.out.println(name.put("B03","Carol"));
        System.out.println(name.put("E22","Grace"));
        System.out.println(name.put("D05","Irene"));
        System.out.println(name.put("V31","David"));
        System.out.println(name.put("Z09","David"));
        System.out.println("---------------------------------");
        System.out.println(name.put("A03","Alice"));
        System.out.println(name.put("V02","Bob"));
        System.out.println(name.put("C01","Alice"));
        System.out.println(name.put("A05","Alice"));
        System.out.println(name.put("B03","Carol"));
        System.out.println(name.put("E22","Grace"));
        System.out.println(name.put("D05","Irene"));
        System.out.println(name.put("V31","David"));
        System.out.println(name.put("Z09","David"));
        System.out.println("---------------------------------");
        System.out.println(name);
        System.out.println("---------------------------------");
        name.put("B03", "許XX"); 
        System.out.println(name);
        System.out.println("---------------------------------");
        System.out.println(name.values());
        System.out.println("---------------------------------");
        Set<String> a = name.keySet() ;
        for(var str : a) {
            System.out.println("ID為：" + str + "，姓名為：" + name.get(str));
        }
        System.out.println("---------------------------------");
        
        
    }
}
