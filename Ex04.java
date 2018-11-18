public class Ex04 {
	public static void main(String[] args) {		
		int x,y,z;
		for(x=1;x<=30;x++){
			for(y=1;y<=30;y++){
				//for(z=1;z<=30;z++){
				z=30-x-y;
				if((x+y+z)==30&&(3*x+2*y+z)==50)
				System.out.println("男人："+x+"\t女人："+y+"\t小孩："+z);
			}
		}
	}
}
//x+Y+Z=30,3X+2Y+Z=50;