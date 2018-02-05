package Arrays;

public class Stocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Stocks s= new Stocks();
 int prices[]=new int[5];
 prices[0]=2;
 prices[1]=1;
 prices[2]=2;
 prices[3]=0;
 prices[4]=1;
 
 int prof=s.maxProfit(prices);
 System.out.println("prof is: "+prof);
	}

	 public int maxProfit(int[] prices) {
	        int j=0;
	        int maxprof=0,prof=0;
	        int ind=0;
	        for(int i=0;i<prices.length;i++){
	            j=i+1;
	            prof=0;
	            while(j<prices.length){
	            if(prices[j]-prices[i]>prof){
	            	prof=prices[j]-prices[i];
	            	ind=j;
	            	System.out.println("prof is: "+prof+" index:"+ind);
	            }
	            j++;
	            }
	               
	            if(ind>i && ind<prices.length-1){   
               i=ind;
               maxprof+=prof;
               System.out.println(maxprof);
	            }else{
	            	if(maxprof<prof)
	            	maxprof=prof;
	            }
               
	            }
	        
	        
	        return maxprof;
	    }
}

