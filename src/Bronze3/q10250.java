package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10250 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        while(T>0){
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor = 0;
            int unit = 0;
            if(n%h==0){
                floor = h*100;
                unit = n/h;
            }else{
                floor = (n%h)*100;
                unit = n/h +1;
            }

            int answer = floor+unit;
            sb.append(answer).append("\n");
            T--;
        }
        System.out.println(sb);
    }
}
