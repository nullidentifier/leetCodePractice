import java.util.Scanner;

public class ClimbingStairs_DP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		for(int a0 = 0; a0 < s; a0++){
			int n = in.nextInt();
			if(n<=36){
				int ways=climbStairs(n);
				System.out.println(ways);
			}
		}
	}
	public static int climbStairs(int n){
		int arr[]=new int[n+1];
		if(n<=1){
			return 1;
		}
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		
		for(int i=4;i<=n;i++){
			arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
		}

		return arr[n];
	}


}
