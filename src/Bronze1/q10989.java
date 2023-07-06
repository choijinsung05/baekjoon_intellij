package Bronze1;

import java.io.*;
import java.util.Arrays;

public class q10989 {
    public static void main(String args []) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        int [] arr = new  int[n];

        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i : arr){
            sb.append(i).append('\n');
        }
        System.out.println(sb);

        br.close();
    }
}
/*
1. Scanner는 시간을 많이 잡아먹는다 buffer 사용해보자 buffer 공부하기!!


*/