package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1717 {
    static int [] parent;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        parent = new int[N+1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        sb = new StringBuilder();
        while(M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int command = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(command == 0){
                merge(a,b);
            }else if ( command == 1){
                check(a,b);
            }
        }
        System.out.println(sb);
    }
    public static int findParent(int x){
        if(parent[x] == x){
            return parent[x];
        }else {
            return parent[x] = findParent(parent[x]);
        }
    }
    public static void merge(int a, int b){
        int ap = findParent(a);
        int bp = findParent(b);

        parent[bp] = ap;
    }
    public static void check(int a,int b){
        int ap = findParent(a);
        int bp = findParent(b);
        if(ap == bp) sb.append("YES\n");
        else sb.append("NO\n");
    }
}
