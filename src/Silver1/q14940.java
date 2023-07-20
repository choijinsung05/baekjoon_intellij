package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q14940 {
    static int N,M;
    static int [][] map;
    static boolean [][] visted;
    static int [][] answer;
    static int [] dx ={1,0,-1,0};
    static int [] dy ={0,1,0,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        answer = new int[N][M];
        visted = new boolean[N][M];

        Point14940 target = new Point14940(0,0,0);
        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
                if(map[y][x] == 2){
                    target.x = x;
                    target.y = y;
                }else if(map[y][x]==0){
                    visted[y][x] = true;
                }
            }
        }
        BFS(target);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visted[i][j]) {
                    System.out.print(answer[i][j] + " ");
                }else{
                    System.out.print(-1+" ");
                }
            }
            System.out.println();
        }
    }
    static void BFS(Point14940 t){
        Queue<Point14940> queue = new LinkedList<>();
        queue.add(t);
        visted[t.y][t.x] = true;
        while (!queue.isEmpty()){
            Point14940 cur = queue.poll();
            answer[cur.y][cur.x] = cur.cost;
            for (int i = 0; i < 4; i++) {
                Point14940 next = new Point14940(cur.x+dx[i],cur.y+dy[i],cur.cost+1);
                if(checkTogo(next)){
                    queue.add(next);
                    visted[next.y][next.x] = true;
                }
            }
        }
    }
    static boolean checkTogo(Point14940 p){
        if(p.x<0 || p.y <0 || p.x>=M || p.y >= N || visted[p.y][p.x]){
            return false;
        }else{
            return true;
        }
    }
}
class Point14940{
    int x;
    int y;
    int cost;

    public Point14940(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}