package Numbers;

public class BitComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findComplement(3));
	}


    public static int findComplement(int num) {
        
        String binString = Integer.toBinaryString(num);
        String newBinString="";
        for(char c : binString.toCharArray()){
            if(c=='1'){
                newBinString= newBinString + '0';
                
            }else{
                 newBinString= newBinString + '1';
            }
            
        }
     return Integer.parseInt(newBinString,2);
        
    }
}