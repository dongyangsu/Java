public class TheNumberOfRabbit {
	public static void main(String[] args) {	
		int rabbit = 1; 
		int newrabbit = 1; 
		int count; 
		int month=40;
		//��һ����
		System.out.print("1"+"\t");
		//�ڶ�����
		System.out.print("1"+"\t");
		//�������¿�ʼ
		for(int i=3;i<=month;i++){  
			count = newrabbit;
			newrabbit = rabbit + newrabbit;
			rabbit = count;  
			System.out.print(newrabbit+"\t");
		}
	}
}
//��һ�����Ӵӳ������3������ÿ���¶���һ�����ӣ�С���ӳ�����3���º�ÿ��������һ�����ӣ������������Ӷ���������ÿ���µ���������Ϊ���٣�