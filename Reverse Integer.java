class Solution {
    public int reverse(int x) {
       int xx = 0;
        boolean sign =false;
         int len = String.valueOf(x).length();
      
            
            int res=0,rem=0;
            for(int i=0; i<len;i++){
                if(x!=0){
                 System.out.println("xx: "+xx+" x:"+x);
                   rem = x%10;
                 xx =res * 10 +  rem ;
                    
             //   xx = res;
                if((xx - rem)/10!= res){
                    return 0;
                }
                    res = xx;
                x = x / 10;
               // len --;
                    
            }           
            }
         return xx;
    }
        
           
}