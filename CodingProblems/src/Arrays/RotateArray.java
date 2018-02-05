package Arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3};
		//arr=;
		rotate(arr,4);
		System.out.println(Arrays.toString(arr));
	}




public static void rotate(int[] nums, int k) {
    k=k%nums.length;

    reverse(nums,0,nums.length-1); //reverse the whole array
    reverse(nums,0,k-1);    //reverse first k elements
    reverse(nums,k,nums.length-1);//reverse last k+1 elements
}


public static void reverse(int [] nums, int st, int end){
    
    while(st<end && end<=nums.length-1){
        int temp=nums[st];
        nums[st]=nums[end];
        nums[end]=temp;
        st++;
        end--;
        
    }
}
}
