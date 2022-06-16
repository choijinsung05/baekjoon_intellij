import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class q2667 {
    static char[][] map;
    static boolean[][] ck;
    static Queue<int[]> q;
    static ArrayList<Integer> homeCnt = new ArrayList<>();
    static int N, cnt;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static void bfs(int x, int y) {
        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            x = q.peek()[0];
            y = q.peek()[1];
            q.remove();
            ck[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int xx = x + dx[i];
                int yy = y + dy[i];
                if (xx < 0 || xx >= N || yy < 0 || yy >= N) continue;
                if (map[xx][yy] == '0' || ck[xx][yy]) continue;
                q.add(new int[]{xx, yy});
                ck[xx][yy] = true;
                cnt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        ck = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == '0' || ck[i][j]) continue;
                cnt = 1;
                q = new LinkedList<int[]>();
                bfs(i, j);
                homeCnt.add(cnt);
            }
        }
        System.out.println(homeCnt.size());
        Collections.sort(homeCnt);
        for (int h : homeCnt) {
            System.out.println(h);
        }
    }
}