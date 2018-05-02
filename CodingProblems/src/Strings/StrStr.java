package Strings;

public class StrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=strStr("mississippi","issip");
		System.out.println(res);
	}
	


    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        char[] hay=haystack.toCharArray();
        char[] need=needle.toCharArray();
        int j=0;
        int i=0;
        int index=-1;
     if(haystack.contains(needle)) {
         while(i<needle.length() && j<haystack.length() ){
             
        //	 System.out.println(j);
                 if(need[i] == hay[j]){
                     if(index==-1){
                          index = j;
                     }
                    
                     i++;
                     j++;
                 }
             else{
                 i=0;
                 if(index!=-1)
                 j=index+1;
                 else j++;
                 index=-1;
             }
        }
     }
  //   System.out.println(index);
      return index;
    }
}