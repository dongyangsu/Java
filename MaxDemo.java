import java.util.Scanner;
public class MaxDemo {
	public static void main(String []args){
		//
		Scanner in=new Scanner(System.in);
		int value1,value2,max;
		value1=in.nextInt();
		value2=in.nextInt();
		
		//
		/*if(value1>value){
			max=value1;
		}else{
			max=value2;
		}
		System.out.println("max="+max);
		max=(value1>value2)?value1:value2;
		System.out.println("max="+max);*/
		
		String str1="hello";
		String str2="hello";
		String str3=new String("hello");
		System.out.println(str1==str2);
	//  System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
			
		}
		
		
		
	}

