//import java.util.Scanner;
public class Stairs {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("ÇëÊäÈë½×Êý£º");
//		int step=in.nextInt();
		int i,num=0;
		for(i=1;i>=100&&i<1000;i++){
			if(i%2==1&&i%3==2&&i%5==4&&i%6==5){
				System.out.print(i);
				if(num%7==0){
					System.out.print(num);
				}
				num++;
			}
			System.out.print(i);
		}
		System.out.print(i);
	}
}
