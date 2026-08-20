/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

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
        
        InputStreamReader ISR = new InputStreamReader (System.in) ;
        BufferedReader BR = new BufferedReader(ISR) ;
        
        File file = new File("log.txt") ;
        
        String[] log = new String[3] ;
        
        try (FileWriter FW = new FileWriter(file,true);
            BufferedWriter BW = new BufferedWriter(FW)) {
            System.out.println("ID : ");
            log[0] = BR.readLine() ;
            System.out.println("password : ");
            log[1] = BR.readLine() ;
            log[2] = LocalDateTime.now().toString() ;
            for (String s : log) {
                BW.write(s);
                BW.newLine();
            }
            BW.newLine();
            System.out.println("----------------");
            BW.newLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println("------------------------");
        ReadFile(file) ;
        
    }

    private static void ReadFile(File file) {
       try (FileReader FR = new FileReader(file);
            BufferedReader BR = new BufferedReader(FR)){
           String msg ;
           while ((msg = BR.readLine()) != null) {
               System.out.println(msg);
           }
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
