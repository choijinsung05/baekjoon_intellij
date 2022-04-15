import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String [] arr = new String[n];

        for(int i = 0;i<n;i++){
            arr[i] = br.readLine();
        }



        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        br.close();
    }
}