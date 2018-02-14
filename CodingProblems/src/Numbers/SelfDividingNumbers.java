package Numbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List<Integer> res= selfDividingNumbers(1,22);
		  
		for(Integer i:res){
			System.out.println(i);
		}
	}

	   public static List<Integer> selfDividingNumbers(int left, int right) {
		    
	        List<Integer> res= new ArrayList<>();
	        int j=0;
	     
	        int len=0,num=0;
	   int flag=0;
	        for(Integer i=left;i<=right;i++){
	            
	            if (String.valueOf(i).contains("0")){
	                
	            }
	            
	            else{
	            	flag=0;
	                len = (int)(Math.log10(i)+1);
	              int  cnt=len;
	              int remNo=i;
	                while(len>0){
	                     num = remNo % 10;
	                      remNo= remNo / 10;
	                    if(i % num != 0){
	                    	
	                       flag=1;
	                    }
	                    else{
	                    	
	                        cnt--;
	                       System.out.println("i: "+i+"num: "+num);
	                    }
	                    len--;
	                    
	                }
	                if(flag!=1){
	                    
	                    res.add(i);
	                    
	                }
	               
	        }
	           
	    }
	         return res;
	}
	
	
}
