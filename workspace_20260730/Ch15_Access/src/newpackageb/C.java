/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackageb;

import newpackagea.A;

/**
 *
 * @author ttoon
 */
public class C extends A{
    
    @Override
    public void dotest(){
        System.out.println("Class C");
        System.out.println("C-A.b = " + b);
        System.out.println("C-A.c = " + c);
        System.out.println("不同package，子類別繼承可直接使用public跟protected物件成員(不用建立新父類別物件但須繼承父類別)");
    }
}
