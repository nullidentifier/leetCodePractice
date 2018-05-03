package Strings;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toUpperCase('s');
	}
	
	public static void toUpperCase(char c){
	
		if(c>96 && c<=122){
			
			char Big=(char) (c - 32);
			System.out.println("The uppercase of "+c +" is: "+Big);
		}
		
		
	}

}
