import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11718 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }
}
