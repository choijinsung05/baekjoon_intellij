package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        while (M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for (int left = i,right = j; left < right ; left++,right--) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i!= arr.length){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());

    }
}
