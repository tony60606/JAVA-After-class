/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        
        kid K1 = new kid("許XX") ;
        K1.col(85,50,92,87,60,85);
        System.out.println(K1);
        
        try(FileOutputStream FOS = new FileOutputStream("K1.kid");
            ObjectOutputStream OOS = new ObjectOutputStream(FOS)) {
            
            OOS.writeObject(K1);
            System.out.println("資料存檔完成");
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        try(FileInputStream FIS = new FileInputStream("K1.kid");
            ObjectInputStream OIS = new ObjectInputStream(FIS)){
        
            System.out.println("檔案大小 : " + OIS.available() + "Bytes" );
            kid k = (kid)OIS.readObject() ;
            
            System.out.println("姓名 : " + k.getName());
            System.out.println("加總 : " + k.getSum());
            System.out.println("平均 : " + k.getAvg());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
