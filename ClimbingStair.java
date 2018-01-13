import java.util.Scanner;

public class ClimbingStairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            if(n<=36){
           long ways=climbStairs(n);
            System.out.println(ways);
            }else{
            	  System.out.println(0);
            }
        }
    }
    public static long climbStairs(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
       
        }
        if(n==2) return 2;
        if(n==3) return 4;
        long ways=0;
        return ways+=climbStairs(n-1)+climbStairs(n-2)+climbStairs(n-3);
       // System.out.println("--"+ways);
        //return ways;
    }
}
