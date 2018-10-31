import java.util.*;
public class Years {
	private static Scanner in;

	public static void main(String[] args){
		in = new Scanner(System.in);
		int y;
		System.out.println("Please write out the years number:");
		y=in.nextInt();
		if(y%400==0){
			System.out.println("此年为闰年");
		}else if(y%4==0&y%100!=0){
			System.out.println("此年为闰年");
		}else{
			System.out.println("此年不是闰年");
		}
	}

}
