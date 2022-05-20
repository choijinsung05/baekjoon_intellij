import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1003 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(t>0){
            int n = Integer.parseInt(br.readLine());
            int one_c0 = 1;
            int one_c1 = 0;
            int two_c0 = 0;
            int two_c1 = 1;
            int ans_c0 = 0;
            int ans_c1 = 0;

            if(n == 0){
                sb.append("1 0");
            }else if(n ==1){
                sb.append("0 1");
            }else{
                int k = 2;
                while (k<=n) {
                    ans_c0 = one_c0 + two_c0;
                    ans_c1 = one_c1 + two_c1;
                    one_c0 = two_c0;
                    one_c1 = two_c1;
                    two_c0 = ans_c0;
                    two_c1 = ans_c1;
                    k++;
                }
                sb.append(ans_c0+" "+ans_c1);
            }
            sb.append("\n");
            t--;
        }
        System.out.println(sb);
    }
}
