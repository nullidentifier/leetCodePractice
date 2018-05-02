import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int trueSeq[]={8,2,5,7};
		int guessedSeq[]={2,3,8,4};
		int res[]=solve(trueSeq,guessedSeq);
		System.out.println(Arrays.toString(res));
	}

	public static int[] solve(int[] trueSeq, int[] guessedSeq){
		int white=0;
		int black=0;
		int arr[]=new int[2];
		if(trueSeq.length!=guessedSeq.length)
			return arr;
		
		Map<Integer,Integer> Seq=new HashMap<>();
		for(int i=0;i<trueSeq.length;i++){
			Seq.put(i, trueSeq[i]);
		}
		for(int i=0;i<guessedSeq.length;i++){
			int key=-1;
			
		//	if(Seq.containsValue(guessedSeq[i])){
				for(Entry<Integer,Integer> entry: Seq.entrySet()){
					if(entry.getValue().equals(guessedSeq[i]) && entry.getKey().equals(i)){  //if pos and value are same
						black++;	
						key=entry.getKey();
						//Seq.remove(entry.getKey());
				}
			else if(entry.getValue().equals(guessedSeq[i]) && !(entry.getKey().equals(i)) ){ //if value is same
				white++;
				key=entry.getKey();
			//	Seq.remove(entry.getKey());
			}
		}
				Seq.remove(key);
	//	Seq.remove();
				 arr[0]= black;
				 arr[1]=white;
		
	}
		return arr;
}
}
