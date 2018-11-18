import java.util.Scanner;
public class FrontNTermAdd {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int fz=1,fm=1,temp=0;
		float s=0f;
		int i;
		System.out.println("ÇëÊäÈëÏîÊı:");
		int n=in.nextInt();
		for(i=1;i<=n;i++){
			System.out.print(fz+"/"+fm);
			if(i!=n)
				System.out.print("+");
			s=s+1.0f*fz/fm;
			temp=fm;
			fz=1;
			fm=temp+2;
		}
		System.out.println(" = "+s);
		System.out.println("i="+i);
	}
}
