import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2193 {

    static long [] dp;

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new long [n+1];

        System.out.println(slove(n));

    }
    public static long slove(int n){

        if(n == 1 || n ==2) return 1;
        else if(dp[n] != 0) return dp[n];
        else{
            return dp[n] = slove(n-1) +slove(n-2);
        }
    }
}
/*
자릿수에 따른 n에 따른 이친수의 개수를 함수f(n)이라고 하자.
f(1) = 1 --- 1
f(2) = 1 --- 10
f(3) = 2 --- 100 101  -> 1 + f(3-2) = 1 + f(1)
f(4) = 3 --- 1000 1001 1010 -> 1 + f(4-3) + f(4-2) = 1 + f(1) +f(2)
f(x) = ? -> 1+f(1) f(2) + ~~~ +  f(x-2)

여기서 생각해볼것이 있다. f(1) + 1 = f(3) 이다 고로 f(4) = 1 + f(1) +f(2) = f(3) +f(2)라고도 생각할수 있다.
즉 피보나치!!
 */