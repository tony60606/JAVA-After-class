/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        
        Path P1 = Paths.get("C:","com1","sample","java","java.txt") ;
        Path P2 = Paths.get("C:","com2","sample","python","python.txt") ;
        
        try {
            Files.createDirectories(P1.getParent()) ;
            Files.createDirectories(P2.getParent()) ;
            System.out.println("資料夾建立完成");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
