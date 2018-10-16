import java.util.Scanner;
public class HomeWork1 {
	public static void main(String[] args){
		//1.输入
		Scanner in=new Scanner(System.in);
		float x,y; //x:鸡;y:兔
		System.out.println("题目：鸡兔同笼，共有35个头，94条脚，问鸡、兔各有多少只？");
		//2.处理
		System.out.println("x+y=35");
		System.out.println("2x+4y=94");
	
		System.out.println("y=((2x+2y)-(2x+4y))/2");
		System.out.println("x=35-y");
		//3.输出
		
		System.out.println("鸡:");
		System.out.println("x=23");
		System.out.println("兔:");
		System.out.println("y=12");
	}

}
