import java.util.Scanner;

public class LongestCommonPrefix {


public static String longestCommonPrefix(String[] strs) {
    if(strs == null || strs.length == 0)    return "";
    String pre = strs[0];
    System.out.println(pre);
    int i = 1;
    while(i < strs.length){
    	  System.out.println("index "+strs[i].indexOf(pre));
        while(strs[i].indexOf(pre) != 0)
        	pre = pre.substring(0,pre.length()-1);
        System.out.println(pre);
        i++;
     
    }
    return pre;
}

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	String[] strs=new String[no];
	for(int i=0;i<no;i++){
	strs[i]=sc.next();	
	}
	String str=longestCommonPrefix(strs);
	System.out.println(str);
}
}