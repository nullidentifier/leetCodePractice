import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    static void staircase(int n) {
        // Complete this function
       // int space=n;
        String space="";
        for(int i=0;i<n;i++){
            String hash="";
            space="";
            for(int j=0;j<=i;j++){
                 hash+="#";
               
             }
            for(int j=0;j<n-i-1;j++){
                space+=" ";
            }
            
             System.out.format(space+hash);
            System.out.println();
           // space--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}