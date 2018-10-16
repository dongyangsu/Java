import java.util.*;
public class ScoreChange {
	public static void main(String args[] ){
		Scanner in=new Scanner(System.in);
		System.out.println("成绩为："); 
		double score=in.nextDouble();
		String level=null;
		
		if(score>=90){
			System.out.println("优秀");
			
		}else if(score>=80&&score<90){
			System.out.println("良好");
			
		}else if(score>=60&&score<80){
			System.out.println("及格");
			
		}else if(score<=60){
			System.out.println("差");
		}
		
	}

}
