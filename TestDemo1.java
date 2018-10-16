import java.util.Scanner;
public class TestDemo1 {
	public static void main(String[] args){
		//1.输入数据
		Scanner in=new Scanner(System.in);
		String stuNo;
		float chinese,math,english,average;
		System.out.println("学号:");
		stuNo=in.nextLine();
		System.out.println("输入语数英成绩:");
		chinese=in.nextFloat();
		math=in.nextFloat();
		english=in.nextFloat();
		//2.处理数据
		average=(chinese+math+english)/3;
		//3.输出结果
		System.out.println("学号:\t"+"语文\t"+"数学\t"+"英语\t"+"平均分");
		System.out.println(stuNo+"\t"+chinese+"\t"+math+"\t"+english+"\t"+average);
		
		
		
	}

}
