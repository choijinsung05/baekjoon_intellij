package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11727 {
    static Integer [] dp;
    static int mod = 10007;

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1];

        dp[1] = 1;
        if(n >=2) dp[2] = 3;

        System.out.println(slove(n));
    }
    static int slove(int num){
        if(dp[num] == null){
            dp[num] = (slove(num-1)+slove(num-2)*2)%mod;
        }

        return dp[num]%mod;
    }

}
