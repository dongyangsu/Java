
public class Divide3No7 {

	public static void main(String[] args) {
		//被3整除不被7整除
//		int i=1000;
//		int num=0;
//		while(i<=9999){
//			
//			if(i%3==0&&i%7!=0){
//				System.out.println(i+"\t");
//				num++;
//				if(num%8==0)
//					System.out.println();
//			}
//				i++;
//		}
//		System.out.println();
//		System.out.println("1000~9999中能被3整除但不被7整除有:"+num+"个");
//
		int num=0;
		for(int i=1000;i<9999;i++){
			if(i%3==0&&i%7!=0){
				System.out.println(i+"\t");
				num++;
				if(num%8==0)
					System.out.println();
			}
			System.out.println();
			System.out.println("1000~9999中能被3整除但不被7整除有:"+num+"个");
		}
	}

}
