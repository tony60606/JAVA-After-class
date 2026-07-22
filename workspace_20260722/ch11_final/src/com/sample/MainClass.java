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
//        SubClass sub = new SubClass(11) ;
//        sub.play();
       
        
        
    }
    
}
final class SuperClass {
    public SuperClass() {
        System.out.println("...........");
    }
    
    public final void play() {
        System.out.println("..........");
    }
}
    
//class SubClass extends SuperClass {
//        int A ;
//        int B = 15 ;
//        int C ;
//        
////        public SubClass(int C) {
////            System.out.printf("A = %d , B = %d , C = %d%n",A,B,C);
////            System.out.println("-------------------------------");
////            this.C = C ;
////            System.out.printf("A = %d , B = %d , C = %d%n",A,B,C);
////        }
//        
//        final int D = 20 ;
//        final int E ;
//        
//        public SubClass(int E) {
//            this.E = E ;
//            System.out.printf("D = %d , E = %d%n",D,E);
//        }
//
////    @Override
////    public void play() {
////        super.play();
////        System.out.printf("D = %d , E = %d%n",D,E);
////    }
//        
//        
//    
//    
//    }