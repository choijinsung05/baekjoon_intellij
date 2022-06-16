import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q2178 {

    static int n;
    static int m;
    static int[][] maze;
    static boolean [][] visited;
    //                  상  하 좌  우
    static int [] dx = {-1, 1, 0, 0};
    static int [] dy = { 0, 0,-1, 1};


    public static void main(String [] args)throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n][m];
        visited = new boolean[n][m];

        for(int x = 0; x<n;x++){
            String s = br.readLine();
            for(int y = 0;y<m;y++){
                maze[x][y] = s.charAt(y)-48;// '0' == 48
            }
        }
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(maze[n-1][m-1]);
    }
    static void bfs(int x, int y){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {x,y});

        while(!que.isEmpty()){
            int [] cur_loc = que.poll();
            int cur_x = cur_loc[0];
            int cur_y = cur_loc[1];

            for(int i=0;i<4;i++){
                int next_x = cur_x + dx[i];
                int next_y = cur_y + dy[i];

                if(next_x < 0||next_y < 0||next_x >= n||next_y >= m)continue;//배열밖같으로 나갈경우
                if(visited[next_x][next_y] || maze[next_x][next_y] == 0)continue; // 방문구역 또는 벽일 경우

                que.add(new int[] {next_x, next_y});
                maze[next_x][next_y] = maze[cur_x][cur_y] +1;
                visited[next_x][next_y] = true;
            }
        }

    }
}
