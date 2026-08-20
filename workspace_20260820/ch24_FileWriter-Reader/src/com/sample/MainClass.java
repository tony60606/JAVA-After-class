/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
        
        File file = new File("文書檔.txt") ;
        
        WriteFile(file) ;
        ReadFile(file) ;
        
    }

    private static void WriteFile(File file) {
       
        String msg = "大大大~大優惠，貓咪大戰爭牛肉麵~ smalls good - 20260820" ;
        
        try (FileWriter FW = new  FileWriter(file)) {
            FW.write(msg);  
            System.out.println("資料輸入完成");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }

    private static void ReadFile(File file) {
       try(FileReader FR = new FileReader(file)){
            int num ;
            while ((num = FR.read()) != -1) {
               System.out.print(num);//印出讀取到字元的字元值
               //System.out.print((char)num); //將資料轉為字元(文字不會變亂碼)
            }
            System.out.println("\n-----------------------") ;
        } catch (IOException ex) { 
           System.out.println(ex);
        } 
    }
    
}
