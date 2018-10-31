import java.util.*;
public class HomeWork3 {
	private static Scanner in;

	public static void main(String[] args){
//		//1.输入
//		int y=0;//x:鸡;y:兔;
//		//2.处理
//		for (int x=0;x<=35;x++){
//			y=35-x;
//			if (2*x+4*y==94){
//		//3.输出
//				System.out.println("鸡:"+x);
//				System.out.println("\n");
//				System.out.println("兔:"+y);
//				
//				
//			}
//		
//		}
//		HomeTest.test(25);
//		HomeTest.compute();
//		HomeTest.Years(2028);
		
		
		in = new Scanner(System.in);
		System.out.println("Please import which week:");
		int w=in.nextInt();
		HomeTest.Week(w);
		
	}
	
}
