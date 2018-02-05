
import java.io.*;
import java.util.*;

public class Voting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int maxvote=0;
        int citizens=sc.nextInt();
        TreeMap<String,Integer> votes=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<citizens;i++){
        
            String candidate=sc.next();
            if(votes.containsKey(candidate)){
                votes.put(candidate, votes.get(candidate)+1);
            }
            else{
                votes.put(candidate,1);
            }
        }
        System.out.println(Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey()) ;
        }
        
       // System.out.println(Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey()) ;
    
    }
