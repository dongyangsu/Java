
public class Divide3No7 {

	public static void main(String[] args) {
		//��3��������7����
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
//		System.out.println("1000~9999���ܱ�3����������7������:"+num+"��");
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
			System.out.println("1000~9999���ܱ�3����������7������:"+num+"��");
		}
	}

}
