/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackagea;

/**
 *
 * @author ttoon
 */
public class A {
    int a = 1 ;
    public int b = 2 ;
    protected int c = 3 ;
    private int d = 4 ;
    
    public void dotest() {
        System.out.println("Class A");
        System.out.println("A.a = " + a );
        System.out.println("A.b = " + b);
        System.out.println("A.c = " + c);
        System.out.println("A.d = " + d);
        System.out.println("同package，同class，物件成員皆可使用");
    }
}
