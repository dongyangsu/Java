import java.util.*;
public class Moneyone {
	public static void main(String args[] ){
		Scanner in=new Scanner(System.in);
		float moneySalary=500;
		int profit=in.nextInt();
		
		if(profit<=1000){
			System.out.println("moneySalary="+moneySalary);
		}else if(profit>1000&&profit<=2000){
			System.out.println("moneySalary="+(profit*0.1+moneySalary));
		}else if(profit>2000&&profit<=5000){
			System.out.println("moneySalary="+(profit*0.15+moneySalary));
		}else if(profit>5000&&profit<=10000){
			System.out.println("moneySalary="+(profit*0.2+moneySalary));
		}else if(profit>10000){ 
			System.out.println("moneySalary="+(profit*0.25+moneySalary));
		}
		
		
	}

}


//��֪ĳ��˾Ա���ĵ�нΪ500��ĳ�����ӹ��̵�����profit����������������ɵĹ�ϵ���£�������λ��Ԫ��
//profit<=1000		û�����
//1000<profit<2000		���10%
//2000<profit<5000		���15%
//5000<profit<10000	���20%
//10000<profit		���25%
//������ĳԱ���������Ӧ�õ���н��
