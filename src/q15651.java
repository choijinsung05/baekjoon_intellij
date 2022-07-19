import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q15651 {

    public static int n,m;
    public static int [] arr;
    public static boolean [] visit;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n+1];

        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int loc){// loc : 번째
        if(loc == m){//수열 완성시
            for(int k : arr){
                sb.append(k).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=n;i++){
            arr[loc] = i;
            dfs(loc+1);
        }
    }
}
