import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2156 {

    static int [] arr;
    static Integer [] dp;

    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n+1];
        dp = new Integer[n+1];


        for(int i = 1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];
        if(n>1){
            dp[2] = arr[1]+arr[2];
        }
        System.out.println(amount(n));
    }
    static int amount(int num){
        if(dp[num] == null){
            dp[num] = Math.max(amount(num-1),arr[num] + Math.max(arr[num-1]+ amount(num-3),amount(num-2)));
        }
        return dp[num];
    }
}
