package Strings;


import java.util.ArrayList;
import java.util.List;

public class Aaagrms {

	public static void main(String[] args){
		String st[]={"SnapDragon vs tomek","savants groped monk","Adam vents prongs ok"};
		
		String str[]=anagrams(st);
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
	}

	
    public static String[] anagrams(String[] phrases){
    
     List<String> list = new  ArrayList<String>();
     String str;
        int j=0;
     for(int i=0;i<phrases.length;i++){
         str=phrases[i].toLowerCase().replace(" ","");
        
         j=i-1;
         if(i==0){
             list.add(phrases[i]);
             continue;
         }else{
         int isAnagramflag=0;
             for(String str1:list){
                 System.out.println("++"+str1.toLowerCase());
                 if(isAnagram(str1.toLowerCase(),str) == 0){
                 isAnagramflag=1;
                    break;
                 }
                 
                 }
                 if(isAnagramflag==0){
                    list.add(phrases[i]);
                 }
             
             }
        }
          String res[]= list.toArray(new String[list.size()]);
        return res;
        
    }

    public static int isAnagram(String str1,String str2){
         int[] arr1=new int[26];
         // int[] arr2=new int[26];
         str1=str1.replace(" ", "");
         str2=str2.replace(" ", "");
          if(str1.length() != str2.length())
          return -1;
          System.out.println("--"+str1);
          for(int i=0;i<str1.length();i++ ){
        	  
            arr1[str1.charAt(i)-'a']++;
            arr1[str2.charAt(i)-'a']--;
          }
          int cnt =0;
          for(int a: arr1){
            if(a>0){
                cnt ++;
            }
          }
          return cnt;
    }    
}