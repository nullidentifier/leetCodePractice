package Arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlusOne p=new PlusOne();
		int digits[] =new int[] {6,9};
		int arr[]=p.plusOne(digits);
		System.out.println(Arrays.toString(arr));
	}

	
	/*  public int[] plusOne(int[] digits) {
	        
	        int arr[]=new int[digits.length+1];
	        int j=arr.length-1;
	        int rem=0;
	        for(int i=digits.length-1;i>=0;i--){
	            
	            if(i == digits.length-1  && digits[digits.length-1]+1 >= 10){
	              arr[j--] = (digits[digits.length-1]+1 ) % 10;
	              rem = (digits[digits.length-1]+1 ) / 10;
	                
	              //  arr[j]=
	            }else if(i == digits.length-1  && digits[digits.length-1]+1 < 10){
	                arr[j--]=digits[digits.length-1]+1 ;
	                System.out.println(arr[j+1]);
	                rem=0;
	            }
	        else if( i != digits.length-1 && rem > 0){
	                if(digits[i]+rem >= 10){
	                    arr[j--] = (digits[i]+rem) % 10;
	                    rem = (digits[i]+rem) / 10;
	                    System.out.println("in else ifff"+arr[j+1]);
	                }else {
	                     arr[j--] = digits[i]+rem;
	                    rem=0;
	                }
	            }else{
	                 arr[j--] = digits[i];
	            System.out.println("else"+arr[j+1]);
	            }
	        }
	        int length=arr.length-1;
	         System.out.println("out "+arr[j+1]+" arr:"+length);
	        
	         int st=j+1;
	        int res[]=Arrays.copyOfRange(arr,st,length+1);
	        
	        return res;
	        
	    }*/
	
	
	//More efficient Solution
	 public int[] plusOne(int[] digits) {
	        
		    int n = digits.length;
		    for(int i=n-1; i>=0; i--) {
		        if(digits[i] < 9) {
		            digits[i]++;
		            return digits;
		        }
		        
		        digits[i] = 0;
		    }
		    
		    int[] newNumber = new int [n+1];
		    newNumber[0] = 1;
		    
		    return newNumber;
		}
}
