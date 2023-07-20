package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q11404 {
    static int [][] dist;
    static final int INF = 10_000_001;
    //노드 100번을 거쳐서 갈수도 있으니까 각 최대비용x노드수보다는 최대값이 커야한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        dist = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dist[i][j] = i==j ? 0 : INF;
            }
        }
        while (m-->0){
            st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            dist[i][j] = Math.min(dist[i][j], c);
        }

        for (int k = 1;k<=n;k++){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(dist[i][j]== INF){
                    sb.append(0).append(" ");
                }else{
                    sb.append(dist[i][j]+" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
