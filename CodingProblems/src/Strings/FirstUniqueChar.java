package Strings;


//Non Repeating Character

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("welcomewelm"));
	}
	
	//my solution
	 public static int firstUniqChar(String s) {
	     /*   if(s.length()==0 || s=="" || s==null)
	            return -1;
	        if(s.length()==1)
	            return 0;*/
	        for(int i=0;i<s.length();i++){
	            int cnt=0;
	            char c= s.charAt(i);
	            for(int j=0;j<s.length();j++){
	                if(c==s.charAt(j) && j!=i){
	                    if(cnt>0){
	                    break;
	                    }
	                    else
	                    cnt ++;
	                }
	            }
	            if(cnt==0){
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	
	
	
	//more efficient solution
	/* public int firstUniqChar(String s) {
	        int[] list = new int[26];
	        for(int i = 0; i < s.length(); i++){
	            list[s.charAt(i)-'a']++;
	        }
	        for(int i = 0; i < s.length(); i++){
	            if(list[s.charAt(i)-'a'] == 1){
	                return i;
	            }
	        }
	        return -1;
	    }*/

}
