import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1002 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d = Math.sqrt(Math.pow(x1-x2,2)+ Math.pow(y1-y2,2));

            if(x1==x2 && y1 == y2 && r1 == r2){//터렛두개가 겹쳐져있을때
                sb.append(-1).append("\n");
            }else if(r1+r2<d || d< r2-r1 || d < r1-r2 || (x1==x2 && y1 == y2 && r1 != r2)){
                sb.append(0).append("\n");
            }else if(r1+r2 == d || d == r2-r1 || d == r1-r2){
                sb.append(1).append("\n");
            }else{
                sb.append(2).append("\n");
            }
        }
        System.out.println(sb);
    }
}
