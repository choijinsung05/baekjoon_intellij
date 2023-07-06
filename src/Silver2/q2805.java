package Silver2;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q2805 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;
        int [] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > end){
                end = arr[i];
            }
        }
        while(start<end){
            int mid = (start + end)/2;
            long sum = 0;

            for(int h : arr){
                if(h - mid > 0) sum+= h-mid;
            }

            if(sum < m) end = mid;
            else start = mid+1;
        }
        System.out.println(start-1);


    }
}
