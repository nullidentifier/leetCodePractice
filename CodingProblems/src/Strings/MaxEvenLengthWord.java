package Strings;

public class MaxEvenLengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= " I would do like it";
		String res= maxLength(s);
		System.out.println(res);
	}
	
	
	public static String maxLength(String s){
		
		String str[]=s.split(" ");
		int len=0;
		String maxString="";
		for(String st:str){
			if(st.length() % 2 == 0 && len<st.length()){
				len=st.length();
				maxString=st;
			}
		}
		
		
		
		return maxString;
		
	}

}
