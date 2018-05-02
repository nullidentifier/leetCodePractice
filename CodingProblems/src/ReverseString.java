

import java.util.*; 
import java.io.*;
import java.lang.*;

class Main {  
  public static String FirstReverse(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       String s[]= str.split(" ");
       String Str;
     /*  for(int i=0;i<s.length-1;i++){
           String newStr = s[i];
           Str+= newStr.reverse()+" ";
           
       }
       Str=s[s.length-1].reverse();*/
       Str=new StringBuilder(str).reverse().toString();
       
    return Str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
