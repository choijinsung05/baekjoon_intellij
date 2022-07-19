import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1966 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        StringTokenizer st = null;

        StringBuilder sb = new StringBuilder();

        while(tc > 0){
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<Integer>  que = new LinkedList<>();

            st = new StringTokenizer(br.readLine()," ");

            for(int i = 0;i<n;i++) {
                int k = Integer.parseInt(st.nextToken());
                que.add(k);
            }

            sb.append("\n");
            tc--;
        }
    }
}
