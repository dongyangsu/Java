import java.util.Scanner;
public class Factorial {
	private static Scanner in;
	public static void main(String[] args){
		in = new Scanner(System.in);
//		//1.
//		int n=in.nextInt();
//		int temp=n;
//		//2.ʹ��while��n�׳˲����
//		int factorial=1;
//		while(n>=1){
//			factorial=factorial*n;
//			n--;
//		}
//		System.out.println(temp+"!="+factorial);
		//3��ʹ��for��n�׳˲����
		int n=in.nextInt();
		int temp=n;
		int factorial=1;
//		for(int i=1;i<=n;i++){
//			factorial=factorial*i;
//		}
		for(;n>=1;n--){
			factorial=factorial*n;
		}
		System.out.println(temp+"!="+factorial);
	}
}
