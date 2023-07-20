package Gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q2206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] maze = new int [N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        Queue<Point> que = new LinkedList<>();
        que.add(new Point(0,0, 1,false));

        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};
        boolean[][][] visited = new boolean[N][M][2];

        while (!que.isEmpty()){
            Point cur = que.poll();
            if(cur.x == M-1 && cur.y == N-1){
                System.out.println(cur.cnt);
                return;
            }
            for (int d = 0; d < 4; d++) {
                int next_x = cur.x + dx[d];
                int next_y = cur.y + dy[d];
                int next_cnt = cur.cnt+1;

                if(next_x<0 || next_x>=M || next_y<0 || next_y>=N) continue;

                if(maze[next_y][next_x]=='0'){ // 벽이 아니면
                    if(!cur.destroy && !visited[next_y][next_x][0]) { // 부신 벽이 여태까지 없었으면
                        que.add(new Point(next_x, next_y, next_cnt, false));
                        visited[next_y][next_x][0] = true;
                    }else if(cur.destroy && !visited[next_y][next_x][1]){ // 벽을 한번 부신 적이 있으면
                        que.add(new Point(next_x, next_y, next_cnt, true));
                        visited[next_y][next_x][1] = true;
                    }

                }else if(maze[next_y][next_x]=='1'){ // 벽이면

                    if(!cur.destroy){ // 한번도 벽을 부순적이 없다면 부순다~
                        que.add(new Point(next_x, next_y, next_cnt, true));
                        visited[next_y][next_x][1] = true;
                    }
                    // 한번 부순 적이 있다면 또 부수고 갈 수 없기 때문에 pass
                }

            }
        }
        System.out.println(-1);
    }
}
class Point{
    int x;
    int y;
    int cnt;
    boolean destroy;

    public Point(int x, int y, int cnt, boolean destroy) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
        this.destroy = destroy;
    }
}
