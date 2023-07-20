package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q3190 {
    static final int APPLE = 2,SNAKE = 1;
    static int N, K, L, Time;
    static int[][] board;
    static int[][] command;
    static int [] dx = {1,0,-1,0};
    static int [] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());// 보드 크기
        K = Integer.parseInt(br.readLine());// 사과 개수

        board = new int[N+2][N+2];//0 N+1은 보드를 벗어났다고 판단
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            board[y][x] = APPLE;
        }

        int L = Integer.parseInt(br.readLine());
        command = new int[L+2][2];
        for (int i = 0; i < L ; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int t = Integer.parseInt(st.nextToken());
            int c = st.nextToken().charAt(0) == 'D' ? 1 : -1;
            command[i][0] = t;
            command[i][1] = c;
        }
        solve();
        System.out.println(Time);
    }
    public static void solve(){
        int idx = 0;
        Deque<Point3190> snake = new LinkedList<>();

        snake.add(new Point3190(1,1,0));
        board[1][1] = SNAKE;
        while (true){
            int cur_x = snake.peekLast().x;
            int cur_y = snake.peekLast().y;
            int cur_d = snake.peekLast().direction;

            int next_x = cur_x+dx[cur_d];
            int next_y = cur_y+dy[cur_d];

            Time++;
            if(!CanMove(next_x,next_y)) break;
            if(board[next_y][next_x] == 0){
                board[snake.peek().y][snake.peek().x] = 0;
                snake.pollFirst();
            }
            board[next_y][next_x] = SNAKE;
            snake.add(new Point3190(next_x,next_y,cur_d));

            if(command[idx][0] == Time){
                snake.peekLast().direction = getdirection(snake.peekLast().direction,command[idx++][1]);
            }
        }
    }

    private static int getdirection(int direction, int i) {
        if(direction == 0 && i==-1){
            return 3;
        }else if(direction==3 && i==1){
            return 0;
        }else{
            return direction+i;
        }
    }

    public static boolean CanMove(int x,int y){
        if(x<1 || x>N || y<1||y>N||board[y][x] == SNAKE){
            return false;
        }
        return true;
    }
}
class Point3190{
    int x;
    int y;
    int direction;

    public Point3190(int x, int y, int d) {
        this.x = x;
        this.y = y;
        this.direction = d;
    }
}