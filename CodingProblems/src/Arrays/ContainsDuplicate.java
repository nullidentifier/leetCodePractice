package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

		
	 public boolean containsDuplicate(int[] nums) {
	        Map<Integer,Integer> intCnt=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	            if(intCnt.containsKey(nums[i])){
	                return true;
	            }
	            else{
	                intCnt.put(nums[i],1);
	            }
	        }
	        return false;
	        
	        
	    }
}
