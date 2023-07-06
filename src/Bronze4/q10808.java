package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10808 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s  = br.readLine();

        int [] alpha = new int[26];
        for(int i = 0;i<s.length();i++){
            int  c = s.charAt(i) - 'a';

            alpha[c] += 1;
        }

        for(int i : alpha){
            System.out.print(i+" ");
        }
    }
}
