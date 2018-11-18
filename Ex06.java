
public class Ex06 {
	public static void main(String[] args){
		int x,y,z;
		for(x=1;x<=9&&x>=1;x++){
			for(y=1;y<=9&&y>=1;y++){
				for(z=0;z<=9&&z>=0;z++){
					if((100*x+10*y+z)+(100*y+10*z+z)==532 && x!=y&&x!=z&&y!=z){
						System.out.println((100*x+10*y+z)+"+"+(100*y+10*z+z)+"=532");
						System.out.println("xΪ:"+x+","+"yΪ:"+y+","+"zΪ:"+z);
						
					}
				}
			}
		}
	}
}
