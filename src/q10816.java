import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q10816 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            int low = 0;
            int high = n-1;
            int mid =0;
            int count = 0;

            while(low <= high){
                mid = (low+high)/2;

                if(arr[mid] == num){
                    count++;

                    break;
                }else if (arr[mid] > num){
                    high = mid-1;
                }else{
                    low = mid +1;
                }
            }
            if(arr[mid] != num) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }
        System.out.println(sb);
    }
}

