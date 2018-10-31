import java.util.*;
public class IfElseDemo {
	private static Scanner in;

	public static void main(String args[] ){
		in = new Scanner(System.in);
		int x=in.nextInt();
		int y;
		
		if(x>5){
			System.out.println("y=x+3");
			
		}else if(x>=0&&x<=5){
			System.out.println("y=0");
			
		}else{
			System.out.println("y=2*x+30");
		}
		
//		Scanner in=new Scanner(System.in);
//		int x=in.nextInt();
//		int y=0;
//		if(x>5)
//			y=x+3;
//		else if(x>=0&&x<=5)
//			y=0;
//		else if(X<0)
//			y=2*x+30;
//		System.out.println("y="+y);
		
		
		
		
		
		
	}
	

}
