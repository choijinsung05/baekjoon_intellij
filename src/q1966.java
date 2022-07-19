import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
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

            LinkedList<int[]>  que = new LinkedList<>();

            st = new StringTokenizer(br.readLine()," ");

            for(int i = 0;i<n;i++) {
                que.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }
            int count = 0;
            while (!que.isEmpty()) {
                int[] now = que.poll();

                Boolean is_print = true;//출력해야되는지 확인하는 변수

                for (int i = 0; i < que.size(); i++) {
                    if (now[1] < que.get(i)[1]) {

                        que.offer(now);

                        for (int j = 0; j < i; j++) {
                            que.offer(que.poll());
                        }
                        is_print = false;
                        break;
                    }
                }
                if(!is_print)continue;

                count++;
                if(now[0] == m) {
                    break;
                }
            }
            sb.append(count).append("\n");
            tc--;
        }
        System.out.println(sb);
    }
}
