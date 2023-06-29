package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q260008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(br.readLine());

        int div = 1_000_000_007;
        long answer = 1;

        for (int i = 0; i < N - 1; i++) {
            answer = (answer * M) % div;
        }
        System.out.println(answer);
    }
}
