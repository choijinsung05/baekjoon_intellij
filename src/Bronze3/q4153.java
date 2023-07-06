package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q4153 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;
        int max = 0;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            if((a*a+b*b) == c*c) {
                sb.append("right");
            }
            else if((a*a+c*c) == b*b) {
                sb.append("right");
            }
            else if((b*b+ c*c) == a*a) {
                sb.append("right");
            }
            else{
                sb.append("wrong");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
