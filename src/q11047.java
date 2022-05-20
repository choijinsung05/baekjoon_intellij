import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11047 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] coin = new int[n];

        for(int i=n-1;i>=0;i--){
            coin[i] = Integer.parseInt(br.readLine());
        }
        int price = 0;
        int count = 0;
        while(price < n){
            while(coin[price] <= k){
                k -= coin[price];
                count++;
            }
            price++;
        }
        System.out.println(count);
    }
}
