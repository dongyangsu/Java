import java.util.*;
public class Ex01 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		//1!+2!+...+n!=?
		System.out.println("«Î ‰»În£∫");
		int n=in.nextInt();
		int i,j,sum=0,temp;
		for(i=1;i<=n;i++){
			temp=1;
			for(j=1;j<=i;j++){
				temp=temp*j;
			}
			sum=sum+temp;
			System.out.print(i+"!");
			if(i!=n)
				System.out.print("+");
		}
		System.out.println("="+sum);
	}
}
