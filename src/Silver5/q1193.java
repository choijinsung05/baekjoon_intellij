package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1193 {//계차수열
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int num = 1;//분자
        int denom =1;//분모

        int k = 1; //대각선 값
        while(k<n){
            denom++;
            k += denom;
        }
        k -= denom;

        if(denom % 2 == 0){//짝수일때
            k++;
            while(k != n){
                num++;
                denom--;
                k++;
            }
        }else{//홀수일때
            k += denom;
            while(k != n){
                num++;
                denom--;
                k--;
            }
        }
        System.out.println(num+"/"+denom);
    }
}
