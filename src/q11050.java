import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11050 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = 1;
        for(int i = n;i>0;i--){
            answer *= i;
        }
        for(int i = k;i>0;i--){
            answer /=i;
        }
        for(int i = n-k;i>0;i--){
            answer /=i;
        }
        System.out.println(answer);

    }
}
