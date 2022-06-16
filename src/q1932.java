import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1932 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] arr= new int[n][n];
        int [] dp = new int[n];

        StringTokenizer st = null;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<=i;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =n-1;i>=0;i--){
            for(int k = 0;k<=i;k++){
                dp[k] += arr[i][k];
            }
            for(int j = 0;j<i;j++){
                dp[j] = Math.max(dp[j],dp[j+1]);
            }
        }
        System.out.println(dp[0]);

    }
}
/*
입력값들을 어디다 저장할까? -> 2차원배열

쓸모 없어지는 공간 낭비에 대한 것은 어떻게 처리 할수 있을까??
-> 해결 방법은??
배열? 연결리스트?
기본 배열? 이차원 배열?

탑다운 바텀업??

바텀업이 쉬워보이긴함
맨 아래 숫자에서 2개씩 비교 하나만 추출하는 느낌
ex) 4 5 2 6 5 에서
  4 5 5 2 2 6 6 5
  |/  |/  |/  |/
  5   5   6   6 이런느낌 그 뒤 다음 숫자와 합
+ 2   7   4   4
-----------------
  7  12  10  10 그뒤로 반복?
*/
