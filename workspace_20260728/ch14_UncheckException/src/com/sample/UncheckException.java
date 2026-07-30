
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ttoon
 */
public class UncheckException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a [] = new int[4] ;
        //a[5] = 18 ;
        String b = null ;
        //b.toUpperCase() ;
        System.out.println(b);
        
        ArrayList<String> list = new ArrayList() ;
        while(true) {
            list.add("測試Unchecked：記憶體不足") ;
            if(list.size() % 1000000 == 0) {
                 System.out.println("資料比數：" + list.size() / 1000000 + "百萬筆"); //Unchecked：OutOfMemoryError: Java heap space
            }
        }
        
        
        
    }
    
}
