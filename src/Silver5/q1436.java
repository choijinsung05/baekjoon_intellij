package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1436 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = 1;
        int answer = 666;
        while(k<n){
            answer++;
            if(String.valueOf(answer).contains("666")){//이부분 공부하기!!!
                k++;
            }
        }
        System.out.println(answer);
    }
}
