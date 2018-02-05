package Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]=new int[] {1, 2, 3, 2, 3};
		int res=singleNumber(num);
		System.out.println(res);;
		
	}
	
	
	/* public static int singleNumber(int[] nums) {
	        int j=0,k=0;
	        for(int i=0;i<nums.length;i++){
	            j=0;
	            k=0;
	            while(j<nums.length){
	            if(nums[i]==nums[j] && i !=j){  //if duplicate element found inc k and break the loop
	             
	                k++;
	                break;
	                
	            }
	                   j++;
	        }
	            if(k==0){
	            //    System.out.println(" --"+k);
	                return nums[i];
	            }
	        }
	        return 0;
	    }
	 */
	 
	 //Better Solution using XOR
	 
	 
	static int singleNumber(int[] nums) {
		
		    int result = 0;
		    for (int i = 0; i<nums.length; i++)
		    {
				result ^=nums[i];
		    }
			return result;
		}

}
