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
		System.out.println("��������"+n+"�׸ߵľ���������"+day+"��");
		
		
//		int day=0,s=0,h=7;
		//whileѭ��
//		while(s<=h){
//			day++;
//			s=s+3;
//			if(s>=h){
//				System.out.println(day);
//				break;
//			}
//			s=s-2;
//		}
		//forѭ��
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
//��7���������3�ף�����׹2�ף��������