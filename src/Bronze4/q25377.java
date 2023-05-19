package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        int answer = Integer.MAX_VALUE;
        while(N-- >0){
            st = new StringTokenizer(br.readLine()," ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A>B)continue;
            else if(A == B){
                answer = Math.min(answer,A);
            }else{
                answer = Math.min(answer,B);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(answer == Integer.MAX_VALUE) sb.append(-1);
        else sb.append(answer);
        System.out.println(sb);
    }
}
