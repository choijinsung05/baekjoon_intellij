package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q3009 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int [] count_x = new int[1001];
        int [] count_y = new int[1001];

        StringTokenizer st = null;

        for(int i =0;i<3;i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            count_x[x] +=1;
            count_y[y] +=1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =1;i<=1000;i++){
            if(count_x[i] != 1)continue;
            sb.append(i);
        }
        sb.append(" ");
        for(int i =1;i<=1000;i++){
            if(count_y[i] != 1)continue;
            sb.append(i);
        }
        System.out.println(sb);
    }
}
