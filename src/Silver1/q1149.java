package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1149 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n+1][3];

        int k = n;
        StringTokenizer st = null;
        while(k>0){
            st = new StringTokenizer(br.readLine());
            arr[k][0] = Integer.parseInt(st.nextToken());
            arr[k][1] = Integer.parseInt(st.nextToken());
            arr[k][2] = Integer.parseInt(st.nextToken());

            if(k != n){
                arr[k][0] += Math.min(arr[k+1][1], arr[k+1][2]);
                arr[k][1] += Math.min(arr[k+1][0], arr[k+1][2]);
                arr[k][2] += Math.min(arr[k+1][0], arr[k+1][1]);
            }

            k--;
        }
            System.out.println(Math.min(arr[1][0],Math.min(arr[1][1],arr[1][2])));
    }
}
