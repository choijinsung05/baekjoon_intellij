import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ucpc2022a {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 1;i<=n;i+=4){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
