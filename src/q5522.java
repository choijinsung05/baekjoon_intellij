import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5522 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for(int i = 1;i<=5;i++){
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
    }
}
