import java.util.*;
public class MonkeyEatPeach {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int sum=1;
		System.out.println("请输入天数:");
		int day=in.nextInt();
		//1.while循环:
		if(day>=1&&day<=10){
			while(day<=9&&day>=1){
				sum=(sum+1)*2;
				System.out.println(sum);
				day++;	
			}
		}else{
			System.out.println("只输出不超过10天的程序!!!");
		}
		System.out.println("第"+day+"天有"+sum+"个桃子");
		//2.for循环:
		if(day>=1&&day<=10){
			for(;day>=0&&day<=9;day++){
				sum=(sum+1)*2;
			}
			System.out.println("第"+day+"天有"+sum+"个桃子");
		}else{
			System.out.println("只输出不超过10天的程序!!!");
		}
	}
}
