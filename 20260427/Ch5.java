import java.util.Scanner ;
public class Ch5 {
	public static void main (String [] args) {
		Scanner A = new Scanner (System.in) ;
		System.out.print("歡迎使用音樂撥放器");
		System.out.print("\n1：播放、2：暫停、３：停止、4：上一首、５：下一首");
		System.out.print("\n請輸入代碼：");
		int num = A.nextInt() ;
		if (num == 1) {
			System.out.print("播放");
		}  else if  (num == 2) {
			System.out.print("暫停");
		}  else if  (num == 3) {
			System.out.print("停止");
		}  else if  (num == 4) {
			System.out.print("上一首");
		}  else if  (num == 5) {
			System.out.print("下一首");
		} else {
			System.out.print("無此操作");
		}
	}
}
