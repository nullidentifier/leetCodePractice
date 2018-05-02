
public class Anagram {

public static void main(String args[]){
	
	String a[]={"a", "jk", "abb", "mn", "aaa"};
	String b[]={"bb","kj","bbc","op","bbb"};
	int res[]=getMinimumDifference(a,b);
	for(int i: res)
	System.out.println(i);
}
static int[] getMinimumDifference(String[] a, String[] b) {
    int len=a.length;
int[] res=new int[len];
  /*  if(a.length!=b.length){
        return -1;
    }*/
    for(int i=0;i<a.length;i++){
        if(a[i].length() != b[i].length())
             res[i]= -1;
  /*      for(char c1: a.toCharArray()){
            for(char c2: b.toCharArray()){
                if(g)
            }
        }*/
        else{
        int[] arr = new int[26];
        for(int j=0; j<a[i].length();j++){
            arr[a[i].charAt(j)-'a']++;
            System.out.println("vv:" +arr[a[i].charAt(j)-'a']);
            arr[b[i].charAt(j)-'a']--;
        }
        int cnt=0;
        for(int k: arr){
            if(k > 0){
                    cnt=cnt + k;
                }  
            System.out.println("cnt:"+cnt);
            
            
                       }
        res[i]=cnt;
    }
    }
    return res;
}
}
