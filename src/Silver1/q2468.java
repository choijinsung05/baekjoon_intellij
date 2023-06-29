package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class q2468 {
    static int N;//총 크기
    static int [][] map;//물높이 저장
    static boolean [][] visited; //방문여부
    static int [] dx = {0, 0,-1, 1};
    static int [] dy = {1,-1, 0, 0};
    //                  상 하 좌  우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int maxH = 0;//지면의 최대 높이

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < N; j++) {
                int num =  Integer.parseInt(st.nextToken());
                maxH = Math.max(maxH,num);
                map[i][j] = num;
            }
        }
        int answer = 1;

        for (int h = 0; h <= maxH; h++) {
            visited = new boolean[N][N];
            int count = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    if(!visited[x][y] && map[x][y] > h){
                        count += dfs(x,y,h);
                    }
                }
            }
            answer = Math.max(answer,count);
        }
        System.out.println(answer);
    }
    static int dfs(int x, int y, int h){
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {//현재위치에서 4방향으로 다음 좌표 구하기
            int next_x = x + dx[i];
            int next_y = y + dy[i];

            if(next_x< 0 || next_y < 0 || next_x>N-1 || next_y>N-1) continue; //배열 밖으로 나갈때
            if(visited[next_x][next_y])continue;//방문여부 체크
            if(map[next_x][next_y] > h){//수면 보다 높은지 확인
                dfs(next_x,next_y,h);
            }
        }
        return 1;
    }
}
