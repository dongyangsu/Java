import java.util.*;
public class MonkeyEatPeach {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int sum=1;
		System.out.println("����������:");
		int day=in.nextInt();
		//1.whileѭ��:
		if(day>=1&&day<=10){
			while(day<=9&&day>=1){
				sum=(sum+1)*2;
				System.out.println(sum);
				day++;	
			}
		}else{
			System.out.println("ֻ���������10��ĳ���!!!");
		}
		System.out.println("��"+day+"����"+sum+"������");
		//2.forѭ��:
		if(day>=1&&day<=10){
			for(;day>=0&&day<=9;day++){
				sum=(sum+1)*2;
			}
			System.out.println("��"+day+"����"+sum+"������");
		}else{
			System.out.println("ֻ���������10��ĳ���!!!");
		}
	}
}
