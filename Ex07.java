public class Ex07 {
	public static void main(String[] args) {
		//����������ӱ�������3�ˡ���ΪA,B,C;��ΪX,Y,Z��
//		A����X�ȣ�C����Y��Z�ȣ���3�Ա���������
		for(int i='x';i<='z';i++)
			for(int j='x';j<='z';j++)
				for(int k='x';k<='z';k++)
					if(i!='x'&&k!='y'&&k!='z'&&i!=j&&i!=k&&j!=k)
//				if(i==j)
//					continue;
				System.out.println("A--"+(char)i+";B--"+(char)j+";C--"+(char)k);
	}
}