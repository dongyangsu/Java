public class Ex07 {
	public static void main(String[] args) {
		//两个兵乓球队比赛，各3人。甲为A,B,C;乙为X,Y,Z。
//		A不与X比，C不与Y，Z比，求3对比赛名单。
		for(int i='x';i<='z';i++)
			for(int j='x';j<='z';j++)
				for(int k='x';k<='z';k++)
					if(i!='x'&&k!='y'&&k!='z'&&i!=j&&i!=k&&j!=k)
//				if(i==j)
//					continue;
				System.out.println("A--"+(char)i+";B--"+(char)j+";C--"+(char)k);
	}
}