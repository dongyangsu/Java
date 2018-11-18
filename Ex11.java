import java.util.*;
public class Ex11 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("n=");
		int n=in.nextInt();
		System.out.println("x=");
		int x=in.nextInt();
		System.out.println("y=");
		int y=in.nextInt();
		if(x<=y)
			return;
		int day=0,s=0;
//		while(s<=n){
//			day++;
//			s=s+x;
//			if(s>=n)
//				break;
//			s=s-y;
//		}
		for(day=1;;day++){
			
			s=s+x;
			if(s>=n)
				break;
			s=s-y;
		}
		System.out.println("青蛙跳出"+n+"米高的井，共用了"+day+"天");
		
		
//		int day=0,s=0,h=7;
		//while循环
//		while(s<=h){
//			day++;
//			s=s+3;
//			if(s>=h){
//				System.out.println(day);
//				break;
//			}
//			s=s-2;
//		}
		//for循环
//		for(;s<=h;day++){
//			s=s+3;
//			if(s>=h){
//				System.out.println(day);
//				break;
//			}
//			s=s-2;
//		}	
	}
}
//井7米深，白天爬3米，晚上坠2米，几天出井