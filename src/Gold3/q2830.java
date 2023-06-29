package Gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[20];
        long answer = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < 20; j++) {
               if((num & (1 << j)) > 0) arr[j]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            answer += (1L << i) * arr[i] * (N-arr[i]);
        }
        System.out.println(answer);
    }
}
