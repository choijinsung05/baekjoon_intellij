package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q4948 {

    public static boolean [] arr = new boolean[246913];
    public static int [] count = new int[246913];

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        solve();

        StringBuilder sb = new StringBuilder();

        while(n != 0){
            sb.append(count[n*2]-count[n]).append("\n");

            n =Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
    public static void solve(){
        arr[0] = arr[1] = true;

        for(int i = 2;i<=Math.sqrt(arr.length);i++){
            if(arr[i]) continue;
            for(int j = i*i;j<arr.length;j += i){
                arr[j] = true;
            }
        }
        int num = 0;
        for(int i = 2;i<arr.length;i++){
            if(!arr[i]) num++;

            count[i] = num;
        }
    }
}
