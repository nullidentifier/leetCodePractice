package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


//finding common elements from 2 arrays




	public Integer[] find(int[] a, int[] b){
		List<Integer> list=new ArrayList<>();
		int i=0;
		int j=0;
	while(i<a.length && j<b.length){
		if(a[i]==b[j]){
		list.add(a[i]);
		i++;
		j++;
		}else if(a[i]>b[j]){
			j++;
		}else {
			i++;
		}
	}
Integer[] res=new Integer[list.size()];
res=list.toArray(res); //toArray returns an object so int wont work as it primitive
return res;
	}



}
