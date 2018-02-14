import java.util.Arrays;
import java.util.Stack;

public class Braces {

 public static void main(String args[]){
	 String[] str=new String[3];
	 str[0]="{}[]";
	 str[1]="{[}]";
	 str[2]="{}[()]";
	 String res[]=braces(str);
	 System.out.println(Arrays.toString(res));
	 
	 
 }

static String[] braces(String[] values) {
    
	String ans[]=new String[values.length];
	int flag=0;
	for(int i=0;i<values.length;i++){
        String str = values[i];
	       
	        Stack<Character> st = new Stack<>();
	        for(char c:str.toCharArray()){
	            switch(c){
	                case '(':st.push(')');
	                    break;
	                case '[':st.push(']');
	                    break;
	                case '{': st.push('}');
	                    break;
	                case')': case'}': case']':if(st.isEmpty() || st.pop()!=c){
	                	ans[i]="NO";
	                	flag=1;
	                }
	                break;
	            } 
	            if(flag==1)
	            	break;
	        }
	       ans[i] = st.isEmpty() ? "YES":"NO";
	    }
   return ans;
}

}