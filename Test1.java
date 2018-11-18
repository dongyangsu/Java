
public class Test1 {
	public static void main(String[] args) {
		for(double y=3;y>=-3;y-=0.2){
			for(double x=-10;x<=10;x+=0.2){
				if(y<=Math.sin(x) + 0.1 && y>=Math.sin(x) - 0.1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
			
	}
}