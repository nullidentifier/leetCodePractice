package Arrays;

public class IsRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={1,2,3,4,5,6};
		int[] b={4,5,6,4,2,9};
		System.out.println(isRotation(a,b));
	}






	public static boolean isRotation(int[] a, int [] b){
		if(a.length!=b.length){
			return false;
}
int i=0;
int j=0;
		while(j<a.length && a[i]!=b[j]){
			j++;
		}
		while(j!=a.length && a[i]==b[j] && i<a.length){
		i++;
		j++;
		if(j==a.length){
			j=0;
}
if(i==a.length)
return true;
		}
		return false;
	}

}
