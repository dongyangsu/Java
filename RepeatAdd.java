import java.util.Scanner;
public class RepeatAdd {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("请输入a值（a为1~9）:");
		int a=in.nextInt();
		System.out.println("请输入重复次数n:");
		int n=in.nextInt();
		int s=0,temp=a;
		for(int i=1;i<=n;i++){
			System.out.println(temp);
			if(i!=n)
				System.out.println("+");
			s=s+temp;
			temp=temp*10+a;
		}
		System.out.println("="+s);
		//2+22+222+2222+22222=?
	}
}
