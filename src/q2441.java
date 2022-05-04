import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2441 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            int space = 0;//공백
            int star = i;//별
            while(space<i){
                sb.append(" ");
                space++;
            }
            while(star<n){
                sb.append("*");
                star++;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
