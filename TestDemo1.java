import java.util.Scanner;
public class TestDemo1 {
	public static void main(String[] args){
		//1.��������
		Scanner in=new Scanner(System.in);
		String stuNo;
		float chinese,math,english,average;
		System.out.println("ѧ��:");
		stuNo=in.nextLine();
		System.out.println("��������Ӣ�ɼ�:");
		chinese=in.nextFloat();
		math=in.nextFloat();
		english=in.nextFloat();
		//2.��������
		average=(chinese+math+english)/3;
		//3.������
		System.out.println("ѧ��:\t"+"����\t"+"��ѧ\t"+"Ӣ��\t"+"ƽ����");
		System.out.println(stuNo+"\t"+chinese+"\t"+math+"\t"+english+"\t"+average);
		
		
		
	}

}
