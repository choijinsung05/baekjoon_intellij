import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1012 {
    static int N,M,K;//가로 세로 배추개수
    static int [][] map;
    static boolean[][] visited;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<int[]>();
        que.add(new int[]{x, y});

        while (!que.isEmpty()) {
            x = que.peek()[0];
            y = que.peek()[1];
            visited[x][y] = true;
            que.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        que.add(new int[]{nx, ny});
                        visited[nx][ny] = true;

                    }
                }
            }
        }
    }
    public static void main(String [] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T>0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M =Integer.parseInt(st.nextToken());//가로
            N =Integer.parseInt(st.nextToken());//세로
            K =Integer.parseInt(st.nextToken());//배추개수

            map = new int[M][N];
            visited = new boolean[M][N];
            count = 0;

            for(int i=0;i<K;i++){//배추 심기
                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(map[i][j] == 1 && !visited[i][j]){
                        bfs(i,j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");

            T--;
        }
        System.out.println(sb);

    }
}

