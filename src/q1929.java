import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1929 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean [] arr = new boolean[n+1];//소수가 아니라면 true
        arr[0] = arr[1] = true;

        StringBuilder sb = new StringBuilder();

        int sqrt = (int) Math.sqrt(n);

        for(int i=2;i<= sqrt;i++){
            for(int j = 2; j<=n/i;j++){
                if(arr[i*j])continue;
                else{
                    arr[i*j] = true;
                }
            }
        }
        for(int i = m;i<=n;i++){
            if(!arr[i]){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
