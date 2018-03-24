import java.util.Arrays;


/*
 * Quick sort is fast recursive non-stable sort algorithm. uses div and conquer principle.
 * BEST CASE
 * In best case quicksort will dive the array into almost 2 identical parts.
 * If the array has n elements then the first run would contain O(n). Sorting the remaining 2 sub arrays willtake 
 * 2*O(n/2) which ends up in to O(n log n);
 * WORST CASE
 * In worst case quicksort selects only one element in each iteration so O(n) + O(n-1)+O(n-2)...+O(1)
 * which is O(n^2) (if the array is sorted and pivot is 1st element or the array is reverse sorted and pivot is last element)
 * AVG CASE
 * THe avg case would be of O(n log n)
 */
public class QuickSort {

	public static void main(String args[]){
		int x[]={30, 20, 50, 40, 70, 10, 35};
		int low=0;
				
		int high=x.length-1;
		quicksort(x,low, high);
		System.out.println(Arrays.toString(x));
	}
	public static void quicksort(int x[], int low, int high){
		
		if(x.length==0 || x==null){
			return;
		}
		if(low>=high){
			return;
		}
		int middle= low+(high-low)/2;
		int pivot= x[middle]; //selecting middle ele as pivot
		
		int i=low;
		int j=high;
		while(i<=j){
			
			while(x[i]<pivot){
				i++;
			}
			while(x[j]>pivot){
				j--;
			}
			if(i<=j){
				int temp =x[i];
				x[i]=x[j];
				x[j]=temp;
				i++;
				j--;
			}
		}
		
		//now sort the left sub array from low to j ie pivot position
		if(low<j){
			System.out.println("low:"+low+" j:"+j);
			quicksort(x,low,j);
		}
		//sort the right sub array
		if(high> i){
			System.out.println("high:"+high+" i:"+i);
			quicksort(x,i,high);
		}
		
	}
}
