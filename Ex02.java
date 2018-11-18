public class Ex02 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++){
//			if(i==3)
//				continue;
			for(j=1;j<=5;j++){
				if(i==3)
					break;
				System.out.printf("%5d",i*j);
			}
			System.out.println();
		
		}
	}
}
