package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1075 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = (N/100)*100;
        StringBuilder sb = new StringBuilder();
        while(true){
            if(N%F == 0){
                int result = N%100;
                if(result <10) sb.append("0");
                sb.append(result);
                break;
            }
            N++;
        }
        System.out.println(sb);

    }
}
