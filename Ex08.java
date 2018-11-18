public class Ex08 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			System.out.println(" ");
			for(int j=0;j<Math.pow(2,i)-1;j++){
				System.out.print("*");
			}
		}
		for(int i=2;i>=1;i--){
			System.out.println(" ");
			for(int j=0;j<Math.pow(2,i)-1;j++){
				System.out.print("*");
			}
		}
	}
}