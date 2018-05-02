package Strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("aA"));
	}
	 public static boolean isPalindrome(String s) {
		 if(s== " " || s.length()==0){
			   return true;
		 }
				        s=s.replaceAll("\\W+","");
				        System.out.println("s:"+s);
			            if(s.length()==1 || s.length()==0){
			            	System.out.println("len:"+s.length());
			                return true;
			            }
				        char arr[]=s.toCharArray();
				        for(int i=0,j=s.length()-1;j>=0 && i<j ;j--,i++){
				            char temp=arr[i];
				            arr[i]=arr[j];
				            arr[j]=temp;
				        }
				        String newString=new String(arr);
			            System.out.println("new:"+newString);
				        if(newString.equalsIgnoreCase(s)){
				        return true;
			    }
				        else
				            return false;
			    
	    }

}
