public class PrimeNumber2 {
	public static void main(String[] args) {
		int m,n;
		System.out.println("100~200间的素数有：");
		boolean prime=true;
		for(n=100;n<=200;n++){
			prime=true;
			for(m=100;m<=n/2;m++){
				if(n%m==0){
					prime=false;
					break;
				}
			}
			if(prime){
				System.out.print(n+" "+"\t");
			}
		}
	}
}