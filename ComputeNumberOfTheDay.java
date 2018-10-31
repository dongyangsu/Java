import java.util.*;
public class ComputeNumberOfTheDay {
	private static Scanner in;	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入年、月、日：");
		int year=in.nextInt();
		int manth=in.nextInt();
		int day=in.nextInt();
		int sum;
		sum=0;
		if(year/4==0&&year/100!=0||year%400==0){
			switch(manth-1){
			case 0:
				sum=sum+day;
				break;
			case 1:
				sum=sum+31+day;
				break;
			case 2:
				sum=sum+29+day;
				break;
			case 3:
				sum=sum+31*2+day+29;
				break;
			case 4:
				sum=sum+31*2+day+29+30;
				break;
			case 5:
				sum=sum+31*3+day+29+30;
				break;
			case 6:
				sum=sum+31*3+day+29+30*2;
				break;
			case 7:
				sum=sum+31*4+day+29+30*2;
				break;
			case 8:
				sum=sum+31*5+day+29+30*2;
				break;
			case 9:
				sum=sum+31*5+day+29+30*3;
				break;
			case 10:
				sum=sum+31*6+day+29+30*3;
				break;
			case 11:
				sum=sum+31*6+day+29+30*4;
				break;
			case 12:
				sum=sum+31*7+day+29+30*4;
				break;
			}
			
		}else{
			switch(manth-1){
			case 0:
				sum=sum+day;
				break;
			case 1:
				sum=sum+31+day;
				break;
			case 2:
				sum=sum+28+day;
				break;
			case 3:
				sum=sum+31*2+day+28;
				break;
			case 4:
				sum=sum+31*2+day+28+30;
				break;
			case 5:
				sum=sum+31*3+day+28+30;
				break;
			case 6:
				sum=sum+31*3+day+28+30*2;
				break;
			case 7:
				sum=sum+31*4+day+28+30*2;
				break;
			case 8:
				sum=sum+31*5+day+28+30*2;
				break;
			case 9:
				sum=sum+31*5+day+28+30*3;
				break;
			case 10:
				sum=sum+31*6+day+28+30*3;
				break;
			case 11:
				sum=sum+31*6+day+28+30*4;
				break;
			case 12:
				sum=sum+31*7+day+28+30*4;
				break;
		}
		}
			System.out.println("今天是第"+sum+"天");
	}
}
