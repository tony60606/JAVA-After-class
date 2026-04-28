import java.util.Scanner ;
public class Ch4 {
	public static void main (String [] args) {
		Scanner A = new Scanner (System.in) ;
		System.out.print("請輸入成績：");
		int score = A.nextInt() ;
		if (score >= 90) {
			System.out.print("A+");
		} else if (score < 90 && score >= 80) {
			System.out.print("A");
		} else if (score < 80 && score >= 70) {
			System.out.print("B");
		} else if (score < 70 && score >= 60) {
			System.out.print("C");
		} else {
			System.out.print("不及格");
		}
	}
}
			
