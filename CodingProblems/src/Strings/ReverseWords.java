package Strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" hello world";
		String res=reverseWords(s);
		System.out.println(res);
		
	}
	 public static String reverseWords(String s) {
	        String res="";
	        String str[]=s.split(" ");
	        for(int k=0;k<str.length;k++){
	            char a[]=str[k].toCharArray();
	            char temp;
	            int j=0;
	            for(int i=0;j<str[k].length()-1 && i<j;i++,j--){
	                temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
	            }
	            String st= new String(a);
	              res+=st+ " ";
	        }
	      return res;
	    }

}
