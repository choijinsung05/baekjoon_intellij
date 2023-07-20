package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] dp = new int[10];
        Arrays.fill(dp,1);

        while(N-- >0){
            for (int i = 0; i < dp.length; i++) {
                if(i == 0){
                    dp[i] = 1;
                }else{
                    dp[i] = dp[i-1] + dp[i] % 10_007;
                }
            }
        }
        System.out.println(dp[9]);
    }
}
