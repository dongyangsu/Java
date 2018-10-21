import java.util.*;
public class ScoreChange {
	private static Scanner in;

	public static void main(String args[] ){
		in = new Scanner(System.in);
		System.out.println("成绩为："); 
//		double score=in.nextDouble();
//		String level=null;
//		
//		if(score>=90){
//			System.out.println("优秀");
//			
//		}else if(score>=80&&score<90){
//			System.out.println("良好");
//			
//		}else if(score>=60&&score<80){
//			System.out.println("及格");
//			
//		}else if(score<=60){
//			System.out.println("差");
//		}
		int score=in.nextInt();
		String level=null;
		
		switch(score/10){
		case 9:
		case 10:
		level="优秀";
//		System.out.println("优秀");
		break;
		case 8:
		level="良好";
//		System.out.println("良好");
		break;
		case 6:
		case 7:
		level="及格";
//		System.out.println(level);
		break;
		default:
		level="差";
//		System.out.println(level);
		
		}
		System.out.println(level);
		System.out.println("end");
	}
		

}
