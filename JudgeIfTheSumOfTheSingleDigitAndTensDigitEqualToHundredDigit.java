import java.util.*;
public class JudgeIfTheSumOfTheSingleDigitAndTensDigitEqualToHundredDigit {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入数字：");
		int number=in.nextInt();
		if(number<1000&&number>=100){
			int c=number%10;
			int b=number%100/10;
			int a=number/100;
			System.out.println(a+" "+b+" "+c);
			if(b+c>a||b+c<a){
				System.out.println("false");
			}else{
				System.out.println("true");
			}
		}else{
			System.out.println("要求输入的是一个3位的数字，输入不准确！");
		}
	}
}

