import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1026 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] arr_a = new int[n];
        int [] arr_b = new int[n];

        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            arr_a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr_b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr_a);
        Arrays.sort(arr_b);


        for(int i=0;i<n;i++){
            answer += arr_a[i]*arr_b[n-1-i];
        }
        System.out.println(answer);
    }
}
