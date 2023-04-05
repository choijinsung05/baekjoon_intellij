package Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q4796 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        StringBuilder sb = new StringBuilder();
        int n = 1;
        while(true) {
            st = new StringTokenizer(br.readLine()," ");
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0)break;
            int count = L * (V/P) + Math.min(L,V%P);
            sb.append("Case "+n+": "+count+"\n");
            n++;
        }
        System.out.println(sb);

    }
}
