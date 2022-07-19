import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2445 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i =1;i<2*n;i++){
            if(i<=n){
                for(int j =1;j<=i;j++){
                    sb.append("*");
                }
                for(int j =i;j<n;j++){
                    sb.append("  ");
                }
                for(int j=1;j<=i;j++){
                    sb.append("*");
                }
            }else{
                for(int j = i;j<2*n;j++){
                    sb.append("*");
                }
                for(int j = n+1;j<=i;j++){
                    sb.append("  ");
                }
                for(int j = i;j<2*n;j++){
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
