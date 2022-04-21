import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1934 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [][] arr = new int[n][2];
        int []  answer = new int[n];
        int p;
        int q;
        int r;
        StringTokenizer st = null;

        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            if(arr[i][0] <= arr[i][1]){
                p = arr[i][1];
                q = arr[i][0];
            }else{
                p = arr[i][0];
                q = arr[i][1];

            }
            r = p%q;

            while(r !=0){
                p = q;
                q = r;
                r = p%q;
            }
            answer[i] = arr[i][0]*arr[i][1]/q;
        }
        for(int k : answer){
            System.out.println(k);
        }
    }
}
