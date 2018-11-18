import java.util.*;
public class PrimeNumber1 {
	private static Scanner in;
	public static void main(String[] args){
	in = new Scanner(System.in);	
		int n=in.nextInt();
		int m;
		boolean prime=true;
		if(n>3){
			prime=true;
			for(m=3;m<=n/2;m++){
			if(n%m==0){
				prime=false;
				break;
			}
			}
			if(prime){
				System.out.print(n);
			}
		}else{
			System.out.println("No The Prime Number!");
		}
	}
}