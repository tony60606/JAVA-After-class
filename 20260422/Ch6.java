import java.util.Scanner ;
public class Ch6 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入身高") ;
		float X = A.nextFloat() ;
		System.out.println("請輸入體重") ;
		float Y = A.nextFloat() ;
		float x = X / 100 ;
		float BMI = Y / (x * x) ;
		System.out.println("您的BMI指數為：" + BMI) ;
		int OBMI = 40 ;
         boolean Z = BMI >= OBMI ;
         System.out.println("您是否過重：" + Z ) ;
	}
}
