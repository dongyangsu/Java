public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("1000���ڵ�����������:");
	    for(int i=1;i<1000;i++){
	    	int sum=0;
	    	for(int j=1;j<i;j++){
	    		if(i%j==0) {
	    			sum=sum+j; 
	    			}
	    		}
	      if(sum==i) {
	    	  System.out.print(sum+" "); 
	        }
	    }
	}
}
          