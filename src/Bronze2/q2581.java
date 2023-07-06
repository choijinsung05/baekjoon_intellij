package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2581 {

    public static boolean sosu[];

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        br.close();

        sosu = new boolean[n+1];
        find_sosu();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = m; i<=n;i++){
            if(sosu[i]==false){
                sum +=i;
                if(min == Integer.MAX_VALUE){
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    public static void find_sosu(){
        sosu[0] = true;
        sosu[1] = true;

        for(int i = 2;i<=Math.sqrt(sosu.length);i++){
            if(sosu[i]) continue;
            for(int k=i*i;k <sosu.length;k+=i){
                sosu[k] = true;
            }
        }
    }
}
