
public class HomeTest {
	public static void test(int a){ 
		
		String str = "weather";
		if (a == 20){
			// print the message
			System.out.println(str);
			
		}else{
			System.out.println("error:" + "sudongyang");
		}
		
	}
	
	public static void compute(){
		int sum = 0;
//		for(int i = 1; i <= 100; i++){
//			sum = sum + i;
//		}
		System.out.print(sum);
		System.out.println("\n");
	}
	
	public static void Week(int w){
		
		if(w<=5 &&w>0){
			System.out.println("go work");
			
		}else if(w<=7&w>5){
			System.out.println("relax");
			
			
		}else{
			System.out.println("超出范围");
			
		}
	}
		
	public static void Years(int y){
		if(y%400==0){
			System.out.println("闰年");
		}else if(y%4==0&y%100!=0){
			System.out.println("闰年");
		}else{
			System.out.println("不是闰年");
		}
	}

}