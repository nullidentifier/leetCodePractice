package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFreqNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,2,2,1,3,3};
		int res=commonEle(arr);
		System.out.println(res);
		
	}
	public static int commonEle(int [] arr){
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
			map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i],1);

				}
		}
	Map.Entry maxentry=null;
	//int maxValue=0;
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			if(maxentry==null || entry.getValue().compareTo((Integer) maxentry.getValue())>0){
				//maxValue=entry.getValue();
				maxentry=entry;
	}

			
		}
	return (int) maxentry.getKey();
		
	}



}

//[1,3,2,1,3,1]===> 1




