import java.util.*;
public class MoneyTwo {
	private static Scanner in;

	public static void main(String args[] ){
		in = new Scanner(System.in);
		
		float FreeForPersonalMoney =5000;
		int personalmoney=in.nextInt();
		
		if(personalmoney<=5000){
			System.out.println("money:"+personalmoney);
		}else if(personalmoney>5000&&personalmoney<=36000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.03));   
		}else if(personalmoney>36000&&personalmoney<=144000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.1));
		}else if(personalmoney>144000&&personalmoney<=300000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.2));
		}else if(personalmoney>300000&&personalmoney<=420000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.25));
		}else if(personalmoney>420000&&personalmoney<=660000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.3));
		}else if(personalmoney>660000&&personalmoney<=960000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.35));
		}else if(personalmoney>960000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.45));
		}
		
		
	}

}

//�ۺ���ϰ
//2018��8��31�գ���ʮ����ȫ����������᳣��ίԱ�����λ��顶�����޸ġ��л����񹲺͹���������˰�����ľ�������
//����˰��������3500Ԫ��ߵ�5000Ԫ��˰�ʱ����£�
//����˰�ʱ�
//����˵��˰
//����  ȫ��Ӧ�����ö�                ˰��%
//1    ������36000Ԫ��               3
//2    ����36000��144000Ԫ�Ĳ���   10
//3	 ����144000��300000Ԫ�Ĳ���  20
//4	 ����300000��420000Ԫ�Ĳ���  25
//5	 ����420000��660000Ԫ�Ĳ���  30
//6	 ����660000��960000Ԫ�Ĳ���  35
//7	 ����960000Ԫ�Ĳ���			 45
//���ʵ�֣������������룬����˰�����벢�����