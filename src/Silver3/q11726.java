package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11726 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //  1<= n <= 1000

        int [] dp = new int[n+2]; // n+1로 둘 경우 case n=1일떄 dp[2] 인덱스 오류 발생

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i<=n;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007; // int 자료형으로는 피보나치 46까지 표현가능 그래서 나머지연산 미리 해줘야됨
        }
        System.out.println(dp[n]);
    }
}
/* 임의의 k 에 대해서 k는 (k-1경우) + (k-2경우) 임
예 n = 5일때
| 한칸 잡아 먹음->
나머지 4칸에 대해서 경우의 수 구하면됨
= 두칸 잡아 먹음->
나머지 3칸에 대해서 경우의 수 구하면됨

심플하게 피보나치라고 생각해도 될둣
 */