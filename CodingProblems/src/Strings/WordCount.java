package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr={"hello","aeeaa","z"};
			wordCount(arr);
	//		wordCount("world");
	}
	
	public static void wordCount(String[] str){
		//String[] s=str.split(" ");
		ArrayList<Integer> arr=new ArrayList<>();
		/*for(char c='a';c<'z';c++){
			arr.add(c);
		}*/
		
		
		for(int i=0;i<str.length;i++)
		{
			char[] c=str[i].toCharArray();
			int cnt=0;
			for(char ch:c){
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
					cnt += 2*(ch-'a'+1);
				}else{
					cnt += ch-'a'+ 1;
				}
			//	System.out.println("cnt:"+cnt);
				
		}
			arr.add(cnt);
		}
			System.out.println(arr.toString());
			
			ArrayList<Integer> newArr=new ArrayList<>(arr);
			Collections.sort(newArr);
			System.out.println(newArr.toString());
			//newArr.get(0)== smallest no
			for(int j=0;j<arr.size();j++){
				
			int k=newArr.get(j);
			
			System.out.println("k:"+k+" j:"+j+" newarr:"+newArr.get(0));
			int index= arr.indexOf(k);
			System.out.println("index:"+index);
			System.out.println(str[index]);
			arr.remove(index);
		//	newArr.remove(j);
			}
			
		/*Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<s.length;i++){
			char[] c=s[i].toCharArray();
			int cnt=0;
			for(char ch:c){
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
					cnt+=2*(ch-'a'+1);
				}
				map.put(s[i],cnt);
				
			}
		}*/
	
	}
}
