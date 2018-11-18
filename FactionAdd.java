public class FactionAdd {
	public static void main(String[] args) {
		int fz=2,fm=1,temp=0;
		float s=0f;
		int i;
		for(i=1;i<=20;i++){
			System.out.print(fz+"/"+fm);//²»»»ÐÐ
//			System.out.println(fz+"/"+fm);//»»ÐÐ
			if(i!=20)
				System.out.print("+");
			s=s+1.0f*fz/fm;
//			if(i<=18)
//				break;
//			if(i<=18)
//				continue;
			temp=fz;
			fz=fz+fm;
			fm=temp;
		}
		System.out.println(" = "+s);
		System.out.println("i="+i);
	}
}
