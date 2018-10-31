
public class sum {

	public static void main(String[] args) {
	//1+2+3+...+100=?
//		int i=1,sum=0;
//		while(i<=100){
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("1~100的和为"+sum);
//		int sum=0;
//		for(int i=1;i<=100;i++){
//			sum=sum+i;
//		}
//		System.out.println("1~100的和为"+sum);
		int i=0,sum=0;
		do{
			sum=sum+i;
			i++;
		}while(i<=100);
		System.out.println("1~100的和为"+sum);
	}
}
