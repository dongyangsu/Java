public class TheNumberOfRabbit {
	public static void main(String[] args) {	
		int rabbit = 1; 
		int newrabbit = 1; 
		int count; 
		int month=40;
		//第一个月
		System.out.print("1"+"\t");
		//第二个月
		System.out.print("1"+"\t");
		//第三个月开始
		for(int i=3;i<=month;i++){  
			count = newrabbit;
			newrabbit = rabbit + newrabbit;
			rabbit = count;  
			System.out.print(newrabbit+"\t");
		}
	}
}
//有一对兔子从出生后第3个月起每个月都生一对兔子，小兔子长到第3个月后每个月又生一对兔子，假设所有兔子都不死，问每个月的兔子总数为多少？