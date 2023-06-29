package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q7562 {
    static int T,size;
    static boolean [][] visted;
    static knight start, end;
    static StringBuilder sb;
    static int [] dx ={1, 2, 2, 1,-1,-2,-2,-1};
    static int [] dy ={2, 1,-1,-2,-2,-1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        sb = new StringBuilder();

        while(T--> 0){
            size = Integer.parseInt(br.readLine());
            visted = new boolean[size][size];

            st = new StringTokenizer(br.readLine()," ");
            start = new knight(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine()," ");
            end = new knight(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));

            bfs(start);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static void bfs(knight cur_index){
        Queue<knight> queue = new LinkedList<>();
        queue.add(cur_index);
        visted[cur_index.x][cur_index.y] = true;

        while (!queue.isEmpty()){
            knight cur = queue.poll();//현재 위치
            int cur_x = cur.x;
            int cur_y = cur.y;
            int cur_move_count = cur.move_count;

            if(cur_x == end.x && cur_y == end.y){//목적지 도착
                sb.append(cur_move_count);
                return;
            }
            for (int i = 0; i < 8; i++) {
                int next_x = cur_x+dx[i];
                int next_y = cur_y+dy[i];

                if(next_x >= 0 && next_y >= 0 && next_x<size && next_y<size && !visted[next_x][next_y]){
                    queue.add(new knight(next_x,next_y,cur_move_count+1));
                    visted[next_x][next_y] = true;
                }
            }
        }
    }
}
class knight{
    int x;
    int y;
    int move_count;
    public knight(int x, int y) {
        this.x = x;
        this.y = y;
        this.move_count = 0;
    }

    public knight(int x, int y, int move_count) {
        this.x = x;
        this.y = y;
        this.move_count = move_count;
    }
}
