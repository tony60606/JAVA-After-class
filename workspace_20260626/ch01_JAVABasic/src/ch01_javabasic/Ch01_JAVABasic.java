/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch01_javabasic;

/**
 *
 * @author ttoon
 */
public class Ch01_JAVABasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //中英文測試
        System.out.println("ABC");
        System.out.println("中文測試");
        System.out.println("-----------------------");
        //區域變數
        String name = "吳大名" ;
        int age = 30 ;
        float weight = 95.42f;
        float height = 171.58f ;
        double BMI = weight / (height/100)*(height/100);
        System.out.println("姓名："+name+"\n年齡："+age+"歲\n體重："+weight+"公斤\n身高："+height+"公分\nBMI為："+BMI);
        System.out.println("------------------------");
        //var
        var name2 = "張大千" ;
        var age2 = 41 ;
        var weight2 = 65.87 ;
        var height2 = 180.55 ;
        var BMI2 = weight2 / (height2/100)*(height2/100);
        System.out.printf("姓名：%s%n年齡：%d歲%n體重%.2f公斤%n身高%.2f公分%nBMI：%.2f",name2,age2,weight2,height2,BMI2); 
        System.out.println("------------------------");
        //底線表示(千分位、小數點後標記、2進位標記)
        var a1 = 1_234_567_890L ;
        var a2 = 3_125.1_221 ;
        var a3 = 0b1001_0010_1111_1011 ;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("------------------------");
        //空間對齊、空白補0、小數點對齊
        System.out.printf("|%10d|\n",123);
        System.out.printf("|%10d|\n",12345);
        System.out.printf("|%10d|\n",1234567);
        System.out.printf("|%10d|\n",12345678);
        System.out.printf("|%10d|\n",123456);
        System.out.printf("|%10d|\n",12);
        System.out.printf("%05d\n",255);
        System.out.printf("%05d\n",31);
        System.out.printf("%05d\n",1004);
        System.out.printf("%05d\n",2);
        System.out.printf("%05d\n",5511);
        System.out.printf("%6.3f\n",9876543.21);
        System.out.printf("%6.3f\n",987654.321);
        System.out.printf("%6.3f\n",98765.4321);
        System.out.printf("%6.3f\n",9876.54321);
        System.out.printf("%6.3f\n",987.654321);
    }
}