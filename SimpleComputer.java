import java.util.*;
public class SimpleComputer {

	private static Scanner in;

	public static void main(String[] args) {
	
		//1.�˵����
		System.out.println("��ѡ�������");
		System.out.println("1����");
		System.out.println("2����");
		System.out.println("3����");
		System.out.println("4����");
		
			
		in = new Scanner(System.in);
		int oper;
		
		float value1,value2,result=0;
		boolean flag = true;
		oper=in.nextInt();
		System.out.println("1:");
		value1=in.nextFloat();
		System.out.println("2:");
		value2=in.nextFloat();
		
		
		char chOper=' ';
		
		//3.����
		switch(oper){
		case 1:
			result=value1+value2;
			chOper='+';
			break;
		case 2:
			result=value1-value2;
			chOper='-';
			break;
		case 3:
			result=value1*value2;
			chOper='*';
			break;
		case 4:
			result=value1/value2;
			chOper='/';
			break;
		default:
			flag=false;
		
			System.out.println("only input 1~4");
		}
		//4.���
		if(flag){
			System.out.println(value1+" "+chOper+" "+value2+" ="+ result);
		}

	}
		

}
