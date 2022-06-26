import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10844 {
    static Long[][] dp;
    static int n;
    final static long mod = 1000000000;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new Long[n+1][10];
        long result = 0;


        for(int i =0; i<10;i++){
            dp[1][i] = 1L;

        }
        for(int i =1;i<10;i++){
            result += step(n,i);
        }
        System.out.println(result % mod);
    }
    static long step(int digit, int v){
        if(digit ==1){
            return dp[digit][v];
        }

        if(dp[digit][v] == null){
            if(v == 0){
                dp[digit][v] = step(digit-1,1);
            }
            else if(v == 9){
                dp[digit][v] = step(digit -1,8);
            }
            else{
                dp[digit][v] = step(digit-1,v-1)+step(digit-1,v+1);
            }
        }
        return dp[digit][v] % mod;
    }

}

