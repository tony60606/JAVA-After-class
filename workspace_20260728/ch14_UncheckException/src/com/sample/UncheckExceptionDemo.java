
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ttoon
 */
public class UncheckExceptionDemo {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in) ;
        try{
        System.out.println("請輸入被除數 a ：");
        int a = i.nextInt() ;
        System.out.println("請輸入被除數 b ：");
        int b = i.nextInt() ;
        System.out.println("計算程式中.....");
        int total = cal(a,b);
        System.out.println("計算結果：" + total);
        } catch (InputMismatchException ex) {
            System.out.println("錯誤1：" + ex);
        } catch (ArithmeticException ex) {
             System.out.println("錯誤2：" + ex) ;
        }
        System.out.println("計算完成......");
    }

    private static int cal(int a, int b) {
        return a / b ;
    }

    
}
