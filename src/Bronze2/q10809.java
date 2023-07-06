package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q10809 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int [] arr = new int[26];

        Arrays.fill(arr, -1);

        for(int i = 0;i<s.length();i++){
            int num = s.charAt(i)-'a';
            if(arr[num] == -1) arr[num] = i;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
