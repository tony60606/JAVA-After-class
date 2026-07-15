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
        Book book1 = new Book() ;
        book1.setLW(15, 20);
        book1.setH(25);
        System.out.println("長為：" + book1.getL());
        System.out.println("寬為：" + book1.getW());
        System.out.println("高為：" + book1.getH());
        System.out.println("長方體體積為：" + book1.cuboid());
        System.out.println("------------------------");
        Book book2 = new Book() ;
        book2.setRadius(18);
        book2.setH(30);
        System.out.println("半徑為：" + book2.getR());
        System.out.println("PI 為：" + book2.PI);
        System.out.println("高為：" + book2.getH());
        System.out.println("圓柱體體積為：" + book2.cylinder());
        
    }
    
}
