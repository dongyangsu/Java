public class NarcissisticNumber {
	public static void main(String[] args) {
		System.out.println("100-1000�е�ˮ�ɻ����У�");
		for(int i=100;i<1000;i++){
			int ge  = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			//ˮ�ɻ����ж�Ҫ��
			if(i == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				System.out.print(i+"\t");
			}
		}
	}
}