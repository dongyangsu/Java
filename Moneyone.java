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


//已知某公司员工的底薪为500，某月所接工程的利润profit（整数）与利润提成的关系如下（计量单位：元）
//profit<=1000		没有提成
//1000<profit<2000		提成10%
//2000<profit<5000		提成15%
//5000<profit<10000	提成20%
//10000<profit		提成25%
//请输入某员工利润，输出应得的月薪。
