package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1987 {
    static int R,C;
    static int [][] map;
    static boolean [] alpabet;
    static int [] dx = {1,0,-1,0};//x축
    static int [] dy = {0,1,0,-1};//y축
                     //우 하 좌 상
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new int[R][C];
        alpabet = new boolean[26];

        for (int y = 0; y < R; y++) {
            String s = br.readLine();
            for (int x = 0; x < C; x++) {
                map[y][x] = s.charAt(x)-'A';
            }
        }

        Point1987 p = new Point1987(0,0);

        dfs(p,0);
        System.out.println(answer);
    }
    public static void dfs(Point1987 p, int count) {
        if (alpabet[map[p.y][p.x]]) {
            answer = Math.max(answer, count);
            return;
        } else {
            alpabet[map[p.y][p.x]] = true;
            for (int i = 0; i < 4; i++) {
                int next_x = p.x + dx[i];
                int next_y = p.y + dy[i];

                if(next_x>=0 && next_y>=0 && next_x < C && next_y<R){
                    dfs(new Point1987(next_x,next_y), count+1);
                }
            }
            alpabet[map[p.y][p.x]] = false;
        }
    }
}
class Point1987 {
    int x;
    int y;
    Queue<Point1987> queue = new LinkedList<>();

    public Point1987(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
