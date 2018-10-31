import java.util.*;
public class MoneyTwo {
	private static Scanner in;

	public static void main(String args[] ){
		in = new Scanner(System.in);
		
		float FreeForPersonalMoney =5000;
		int personalmoney=in.nextInt();
		
		if(personalmoney<=5000){
			System.out.println("money:"+personalmoney);
		}else if(personalmoney>5000&&personalmoney<=36000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.03));   
		}else if(personalmoney>36000&&personalmoney<=144000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.1));
		}else if(personalmoney>144000&&personalmoney<=300000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.2));
		}else if(personalmoney>300000&&personalmoney<=420000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.25));
		}else if(personalmoney>420000&&personalmoney<=660000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.3));
		}else if(personalmoney>660000&&personalmoney<=960000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.35));
		}else if(personalmoney>960000){
			System.out.println("money:"+(personalmoney-(personalmoney-FreeForPersonalMoney)*0.45));
		}
		
		
	}

}

//综合练习
//2018年8月31日，第十三届全国人民代表大会常务委员会第五次会议《关于修改〈中华人民共和国个人所得税法〉的决定》，
//将个税免征额由3500元提高到5000元。税率表如下：
//个人税率表
//个人说得税
//级数  全年应纳所得额                税率%
//1    不超过36000元的               3
//2    超过36000至144000元的部分   10
//3	 超过144000至300000元的部分  20
//4	 超过300000至420000元的部分  25
//5	 超过420000至660000元的部分  30
//6	 超过660000至960000元的部分  35
//7	 超过960000元的部分			 45
//编程实现：输入年收收入，计算税后收入并输出。