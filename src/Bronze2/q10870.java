package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10870 {
    public static void main(String []args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a0 = 0;
        int a1 = 1;
        int k = 0;
        int answer = 0;
        while(k <=n){
            if(k==0 || k == 1){
                answer = k;
            }else{
                answer = a0+a1;
                a0 = a1;
                a1 = answer;
            }
            k++;
        }
        System.out.println(answer);
    }
}
