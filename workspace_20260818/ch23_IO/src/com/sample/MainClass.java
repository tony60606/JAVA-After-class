/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
        
        File file = new File("檔案1.txt") ;
        Write(file) ;
        
    }

    private static void Write(File file) {
       String msg = "Hallo , User , Welcome to JAVA !!" ;
       
        try (FileOutputStream Fo = new FileOutputStream(file)) { 
            Fo.write(msg.getBytes());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}


