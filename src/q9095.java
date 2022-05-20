import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q9095 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int n;
        int answer;
        int [] arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i = 4;i<11;i++){
            arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
        }
        while(T>0){
            n = Integer.parseInt(br.readLine());

            sb.append(arr[n]).append("\n");

            T--;
        }
        System.out.println(sb);
    }
}
