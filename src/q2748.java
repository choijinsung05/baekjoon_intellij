import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2748 {
    static long [] dp;//int형 배열은 비보나치 45?? 까지밖에 표현할수 없다

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new long[n+1];//0~n번째 까지의 피보나치수를 담는 배열을 선언
        Arrays.fill(dp,-1);//초기값을 0이 아닌 -1로 표현
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fibo(n));
    }
    static long fibo(int n){//재귀함수
        if(n == 0 || n ==1) return dp[n];

        if(dp[n] == -1){
            dp[n] = fibo(n-2)+fibo(n-1);
        }
        return dp[n];
    }
}
