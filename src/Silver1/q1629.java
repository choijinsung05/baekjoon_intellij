package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1629 {
    public static long div;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        div = Long.parseLong(st.nextToken());

        System.out.println(multiple(A,B));
    }
    public static long multiple(long num , long exponent){
        //종료조건
        if(exponent == 1){
            return num%div;
        }
        /*분할조건
            1. 10^4 = 10^2 * 10^2
            2. 10^5 = 10^2 * 10^3 (지수가 큰수라면 재귀라서 시간초과)
                -> 10^2 두개 10
        */
        long half = multiple(num,exponent/2);

        return exponent % 2 == 0 ?
                half * half % div :
                (half * half % div) * num % div;
    }
}
