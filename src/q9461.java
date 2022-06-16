import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q9461 {
    static Long [] dp;

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        dp = new Long[101];
        dp[0] = 0L;
        dp[1] = dp[2] = dp[3] = 1L;
        dp[4] = dp[5] = 2L;

        StringBuilder sb = new StringBuilder();

        do {
            int n = Integer.parseInt(br.readLine());

            sb.append(p(n)).append("\n");
            T--;
        }while(T>0);
        System.out.println(sb);
    }
    static Long p(int num){
        if(dp[num] == null){
            dp[num] = p(num-1) + p(num-5);
        }
        return dp[num];
    }
}
/*
피보나치 응용?
f(n) =
        1             ···· (n=1 ,n=2, n=3)
        2             ···· (n=4 ,n=5)
        f(n-1) f(n-5) ···· (n>=6)

범위 에서 틀렸다. int -> Integer -> long으로 바꿈(자료형 정리 한번 필요할꺼 같음)

 */