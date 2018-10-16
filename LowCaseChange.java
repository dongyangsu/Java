import java.util.*;
public class LowCaseChange {
	public static void main(String args[] ){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		//System.out.println(str);
		char ch=str.charAt(0);
		//System.out.println(ch);
		char ch2=' ';
		if(ch>='a'&& ch<='z'){
			ch2=(char)(ch-32);//´óÐ´¡°£¨ch+32£©¡±£»
			System.out.println(ch2);
		}else{
			System.out.println(ch);
		}
	}

}
