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
public class D {
    A a = new A() ;
    public void dotest() {
        System.out.println("Class D");
        System.out.println("D-A.b = " + a.b);
        System.out.println("不同package，不同class，只能用public物件成員");
    }
}
