import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2231 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = Integer.toString(n);

        int result = 0;

        int min = (s.length()-1)*9 + s.charAt(0)-48;
        int sum = 0;
        for(int i = n-min;i<n;i++){
            int num = i;
            sum = i;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum == n){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
