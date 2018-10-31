import java.util.*;
public class HoursWorker {
	private static Scanner in;	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入小时:");
		int hour=in.nextInt();
		System.out.println("请输入周几:");
		int week=in.nextInt();
		int money=0;
		switch(week){
		case 1:
			money=35*hour;
		break;
		case 2:
			money=35*hour;
		break;
		case 3:
			money=35*hour;
		break;
		case 4:
			money=35*hour;
		break;
		case 5:
			money=35*hour;
		break;
		case 6:
			money=50*hour;
		break;
		case 7:
			money=50*hour;
		break;
		default:
			System.out.println("No anythings");
		}
		System.out.println(money);
	}

}
