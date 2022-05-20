import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2920 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[8];

        for(int i = 0;i<8;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(arr));

    }
    public static String solve(int [] arr){
        int k = arr[0];
        if(arr[0] == 1){
            while(k<=7){
                if(arr[k]!= k+1){
                    return "mixed";
                }
                k++;
            }
            return "ascending";
        }else if (arr[0] == 8){
            while(k>1){
                if(arr[k-1]!= 9-k){
                    return "mixed";
                }
                k--;
            }
            return "descending";
        }

        return "mixed";
    }
}
