package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q15990 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 100_000;
        int k = 3;
        long div =1_000_000_009;
        long [][] dp = new long[n+1][k+1];
        long answer = 0;
        for (int i = 1; i <= k; i++) {
            dp[i][i] = 1;
        }
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= k; y++) {
                long temp = 0;
                for (int z = 1; z <= k; z++) {
                    if(z == y)continue;
                    try {
                        temp = (temp + dp[x-y][z])%div;
                    }catch (NullPointerException e1){
                        continue;
                    }catch (ArrayIndexOutOfBoundsException e2){
                        continue;
                    }
                }
                dp[x][y] = (dp[x][y]+ temp)%div;
            }
        }
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-->0){
            n = Integer.parseInt(br.readLine());
            answer = 0;
            for (int i = 1; i <= k; i++) {
                answer = (answer+dp[n][i])%div;
            }
            sb.append(answer+"\n");
        }
        System.out.println(sb);
    }
}
