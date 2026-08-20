/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
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
        
        FileSystem F1 = FileSystems.getDefault() ;
        
        
        Path P1 = F1.getPath("C:\\Users\\Tom\\Documents\\test.txt") ;
        
        System.out.println("P1 = " + P1);
        
        Path P2 = F1.getPath("D:", "Java", "Project", "Main.java") ;
        System.out.println("P2 = " + P2);
        
        Path P3 = F1.getPath("C:/Users/John/Desktop/data.txt") ;
        System.out.println("P3 = " + P3);
        
        Path P4 = Paths.get("E:", "Photo", "2026", "cat.jpg") ;
        System.out.println("P4 = " + P4);
        
        System.out.println("檔案名稱 : " + P4.getFileName());
        System.out.println("路徑 : " +P4.getParent());
        System.out.println("是否為絕對路徑 : " + P4.isAbsolute());
        System.out.println("轉成絕對路徑 : " + P4.toAbsolutePath());
        System.out.println("根目錄 : " + P4.getRoot());
        System.out.println("取索引值第2的值 : " + P3.getName(2));
        System.out.println("取索引值第2~4之間的值 : " + P2.subpath(1, 3));
        System.out.println("轉換成URI :　" + P4.toUri());
        
        
        System.out.println("--------------------------------------");
        Path P5 = Paths.get("C:/Users/John/Documents/Java/Project/../Backup/data/test.txt") ;
        System.out.println("P5 : " + P5);
        P5 = P5.normalize() ;
        System.out.println("P5 : " + P5);
        System.out.println("--------------------------------------");
        Path P6 = Paths.get("D:/Company/./Department/Java/Project/../Resources/./File/report.txt") ;
        System.out.println("P6 : " + P6);
        P6 = P6.normalize() ;
        System.out.println("P6 : " + P6);
        System.out.println("--------------------------------------");
        Path P7 = Paths.get("D:/Company/Department/Java/Project") ;
        System.out.println(P7.resolve(Paths.get("java.exe")));
        System.out.println(P7.resolve("java.exe"));
        System.out.println(P7.resolve("/java.exe"));
        System.out.println(P7.resolve("Resources/Backup/java.exe"));
        System.out.println(P7.resolve("/Resources/Backup/java.exe"));
        System.out.println("--------------------------------------");
        Path P8 = Paths.get("C:", "Users", "John", "Documents", "Java", "Project", "Main.java");
        Path P9 = Paths.get("C:", "Backup", "Data", "info.txt") ;
        System.out.println("P8 : " + P8);
        System.out.println("P9 : " + P9);
        System.out.println(P8.relativize(P9));
        
        
    }
    
}
