import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2440 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(n >=1){
            int i= 1;
            while(i <=n){
                sb.append("*");
                i++;
            }
            sb.append("\n");
            n--;
        }
        System.out.println(sb);
    }
}
