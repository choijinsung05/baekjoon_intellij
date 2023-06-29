package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (C-- > 0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int [] arr = new int[N];
            double average = 0;
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
                average += num;
            }
            average /= N;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if(average < arr[i]){
                    count++;
                }
            }
            double answer = (double) count*100/N;
            sb.append(String.format("%.3f%%\n",answer));
        }
        System.out.println(sb);
    }
}
