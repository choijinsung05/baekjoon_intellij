package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1890 {
    static int N;
    static int [][] board;
    static long [][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        dp = new long[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i],-1);
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long answer = dfs(0,0);
        System.out.println(answer);

    }
    public static long dfs(int x,int y){
        int value = board[x][y];
        if(x == N-1 && y == N-1){
            return 1;
        }
        if(dp[x][y] == -1){
            dp[x][y] = 0;
            int x1 = x+value;
            int y1 = y;
            int x2 = x;
            int y2 = y+value;
            if((x1 >= 0 && x1 <N) && (y1>=0 && y1 < N)){
                dp[x][y] += dfs(x1,y1);
            }
            if((x2 >= 0 && x2 <N) && (y2>=0 && y2 < N)){
                dp[x][y] += dfs(x2,y2);
            }
        }
        return dp[x][y];
    }
}
