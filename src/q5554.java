import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5554 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i = 0; i<4;i++){
            sum += Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();

        sb.append(sum/60).append("\n");
        sb.append(sum%60);

        System.out.println(sb);
    }
}
