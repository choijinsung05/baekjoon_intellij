package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2292 {//계차순열??
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());

        int k = 1;//방번호
        int count = 1;//거쳐가는방

        while(k < n){
            count++;
            k = k + (count-1)*6;
        }
        System.out.println(count);
    }
}
