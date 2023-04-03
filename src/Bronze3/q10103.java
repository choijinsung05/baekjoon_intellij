package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10103 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int A = 100;
        int B = 100;
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a>b) B-=a;
            if(a<b) A-=b;
        }
        StringBuilder sb  = new StringBuilder();
        sb.append(A).append(" ").append(B);
        System.out.println(sb);
    }
}
