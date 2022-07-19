import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1037 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int high = 0;
        int low = 1000000;

        StringTokenizer st  = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            int num = Integer.parseInt(st.nextToken());

            if(num > high) high = num;
            if(num < low) low = num;
        }
        System.out.println(high*low);
    }
}
/*
최댓값과 최소값을 곱하는 이유:
N 약수들을 나열
ex a b c d e f ~~ z 라고 하자
a = 1 z = N 이다.
우리는 여기서 b~y까지의 수가 주어지는데
이 수에서 양끝의 곱은 N*1 = N과 동일하다.(마지막 중아은 제곱)
*/