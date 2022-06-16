import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2156 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n+1];
        int [] next1 = new int[n+1];//이전에 골랐던 포도주 바로 다음것을 선택한경우
        int [] next2 = new int[n+1];//이전의 골랐던 포도주 이후 2번째 것을 선택한경우

        int max_n = 0;

        arr[1] = Integer.parseInt(br.readLine());
        next1[1] = arr[1];
        max_n = arr[1];
        if(n>=2){
            arr[2] = Integer.parseInt(br.readLine());
            next1[2] = arr[1]+arr[2];
            next2[2] = arr[2];
            max_n = next1[2];
        }

        for(int i = 3;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            next1[i] = next2[i-1]+arr[i];
            next2[i] = next1[i-2]+arr[i];
            max_n = Math.max(max_n,Math.max(next1[i],next2[i]));
        }
        System.out.println(max_n);
    }
}
