import java.util.*;
public class ScoreChange {
	private static Scanner in;

	public static void main(String args[] ){
		in = new Scanner(System.in);
		System.out.println("�ɼ�Ϊ��"); 
//		double score=in.nextDouble();
//		String level=null;
//		
//		if(score>=90){
//			System.out.println("����");
//			
//		}else if(score>=80&&score<90){
//			System.out.println("����");
//			
//		}else if(score>=60&&score<80){
//			System.out.println("����");
//			
//		}else if(score<=60){
//			System.out.println("��");
//		}
		int score=in.nextInt();
		String level=null;
		
		switch(score/10){
		case 9:
		case 10:
		level="����";
//		System.out.println("����");
		break;
		case 8:
		level="����";
//		System.out.println("����");
		break;
		case 6:
		case 7:
		level="����";
//		System.out.println(level);
		break;
		default:
		level="��";
//		System.out.println(level);
		
		}
		System.out.println(level);
		System.out.println("end");
	}
		

}
