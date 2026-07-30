/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ttoon
 */
public class Exception1 extends Exception{
    
    private int num ;
    
    public Exception1(String message , int num) {
        super(message) ;
        this.num = num ;
    }

    @Override
    public String toString() {
        return  "系統代碼：" + num + "，請將代碼交給系統管理員";
    }
    
    
}
