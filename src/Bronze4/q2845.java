package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2845 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int [] arr = new int[5];

        st = new StringTokenizer(br.readLine());
        for(int i =0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int n:arr){
            sb.append(n-l*p+" ");
        }
        System.out.println(sb.toString());
    }
}
