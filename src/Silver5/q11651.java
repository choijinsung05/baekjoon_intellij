package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class q11651 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            if(i != n-1)st = new StringTokenizer(br.readLine());
        }

        Arrays.sort(arr, (a1, a2)->{
            if(a1[1] == a2[1]){
                return a1[0] - a2[0];
            }else{
                return a1[1] - a2[1];
            }
        });
        for(int i = 0; i<n;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
