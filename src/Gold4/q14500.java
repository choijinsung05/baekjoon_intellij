package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q14500 {
    static int N,M;
    static int [][] board;
    static boolean [][] visted;
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());//행
        M = Integer.parseInt(st.nextToken());//열

        board = new int[N][M];
        visted = new boolean[N][M];

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int x = 0; x < M; x++) {
                board[y][x] = Integer.parseInt(st.nextToken());
            }
        }
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                visted[y][x] = true;
                dfs(x,y,board[y][x],1);
                visted[y][x] = false;
            }
        }
        System.out.println(answer);
    }
    public static void dfs(int cur_x, int cur_y, int sum, int size){
        if(size == 4){
            answer = Math.max(answer,sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int next_x = cur_x + dx[i];
            int next_y = cur_y + dy[i];

            if(next_x<0 || next_y<0 || next_x>=M || next_y>=N){
                continue;
            }
            if(!visted[next_y][next_x]){
                if(size == 2){
                    visted[next_y][next_x] = true;
                    dfs(cur_x,cur_y,sum+board[next_y][next_x],size+1);
                    visted[next_y][next_x] = false;
                }
                visted[next_y][next_x] = true;
                dfs(next_x,next_y,sum+board[next_y][next_x],size+1);
                visted[next_y][next_x] = false;
            }
        }

    }
}
