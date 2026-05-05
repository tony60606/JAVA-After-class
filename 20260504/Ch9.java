import java.util.Scanner ;
public class Ch9 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入第 一個小數：") ;
		float a = A.nextFloat() ;
		System.out.println("請輸入第二個小數：") ;
		float b = A.nextFloat() ;
		float ans1 = a + b ;
		float ans2 = a - b ;
		float ans3 = a *  b ;
		float ans4 = a / b ;
		float ans5 = a % b ;
		System.out.printf("第一個小數為：%.2f\n第二個小數為：%.2f\n兩者和為：%.2f\n兩者差為：%.2f\n乘機為：%.2f\n相除商為：%.0f\n餘數為：%.0f",a,b,ans1,ans2,ans3,ans4,ans5) ;
	}
}
		
