public class Ex12 {
	public static void main(String[] args) {
		double PI=0;
		double fm=1;
		int n=1;
		double adder=0;
		while(true){
			adder=4.0/fm;
			if(n%2==0)
				PI=PI-adder;
			else
				PI=PI+adder;
				n++;
				fm=2*n-1;
				if(PI>=3.1415926&&PI<=3.1415927)
					break;
		}
		System.out.println("经过"+n+"次运算，得到圆周率值为："+PI);
	}
}