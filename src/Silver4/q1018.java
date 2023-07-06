package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1018 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][] borad = new int[n][m];
        int min = 64;//모두 바꾸는 경우가 최솟값이라고 생각하자

        for(int i = 0;i<n;i++){//2500번 정도?? 루프 돌음
            String s = br.readLine();
            for(int j =0;j < m;j++){
                if(s.charAt(j) == 'W') borad[i][j] = 1;
                else borad[i][j] = 0;
            }
        }
        for(int i =0;i<n-7;i++){
            for(int j = 0;j<m-7;j++){
                int x = 0;
                int y = 0;
                int k = 1;
                int answer = 0;
                while(x<8){
                    while(y<8){
                        if(borad[i+x][j+y] != k) answer++;
                        if(k == 1) k = 0;
                        else k = 1;
                        y++;
                    }
                    if(k == 1) k = 0;
                    else k = 1;
                    x++;
                    y=0;
                }
                if(min > answer ) min = answer;
                x = 0;
                y = 0;
                k = 0;
                answer = 0;
                while(x<8){
                    while(y<8){
                        if(borad[i+x][j+y] != k) answer++;
                        if(k == 1) k = 0;
                        else k = 1;
                        y++;
                    }
                    if(k == 1) k = 0;
                    else k = 1;
                    x++;
                    y=0;
                }
                if(min > answer ) min = answer;
            }
        }
        System.out.println(min);
    }
}
