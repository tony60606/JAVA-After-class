/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackagea;

/**
 *
 * @author ttoon
 */
public class B {
    A a = new A() ;
    public void dotest() {
        System.out.println("Class B");
        System.out.println("B-A.a = " + a.a);
        System.out.println("B-A.b = " + a.b);
        System.out.println("B-A.c = " + a.c);
        System.out.println("同package，不同class，不能用private物件成員");
    }
    
}
