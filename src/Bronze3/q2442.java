package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2442 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String space = " ";
        String star = "*";

        StringBuilder sb = new StringBuilder();

        for(int i = 1;i<=n;i++){
            int k = n-i;
            while(k>0){
                sb.append(space);
                k--;
            }
            k = i*2-1;
            while(k>0){
                sb.append(star);
                k--;
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
