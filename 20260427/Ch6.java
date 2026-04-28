import java.util.Scanner ;
public class Ch6 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.print("歡迎光臨OO餐廳");
		System.out.print("\n請輸入您要訂購的餐點代碼：");
		String set = scan.next() ;
		System.out.print("\n請輸入您要訂購的飲料代碼：");
		String drink = scan.next() ;
		switch (set) {
			case  "A"  :
				System.out.print("套餐A：勁辣雞腿堡+大薯+中杯飲料") ;
			break ;
			case  "B" :
				System.out.print("套餐B：麥克雞塊10塊+小薯+中杯飲料") ;
			break ;
			case  "C" :
				System.out.print("套餐C：勁辣雞翅/雞腿+蘋果派+中杯飲料") ;
			break ;
			case  "D" :
				System.out.print("套餐D：勁辣雞腿堡+麥克雞塊6塊+中杯飲料") ;
			break ;
			case  "E" :
				System.out.print("套餐E：無敵大麥克+勁辣雞腿+中杯飲料") ;
			break ;
			default  :
				System.out.print("中杯飲料") ;
			break ;
		}
		switch (drink) {
			case  "A" :
				System.out.print("\n您的飲料為：可樂") ;
			break ;
			case  "B" :
				System.out.print("\n您的飲料為：雪碧") ;
			break ;
			case  "C" :
				System.out.print("\n您的飲料為：零卡可樂") ;
			break ;
			case  "D" :
				System.out.print("\n您的飲料為：檸檬紅茶") ;
			break ;
			case  "E" :
				System.out.print("\n您的飲料為：無糖綠茶") ;
			break ;
			default  :
				System.out.print("\n您的飲料為：飲料換大杯濃湯") ;
			break ;
		}
	}
}
