package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2444 {
        public static void main(String [] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();

            for(int i =1;i<2*n;i++){
                if(i<=n){
                    for(int j = 0;j<n-i;j++){
                        sb.append(" ");
                    }
                    for(int j = 0;j<i*2-1;j++) {
                        sb.append("*");
                    }
                }else{
                    for(int j = n;j<i;j++){
                        sb.append(" ");
                    }
                    for(int j = 1;j<4*n-2*i;j++){
                        sb.append("*");
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb);
    }
}
/*
n   공   별
1    4   1
2    3   3
3    2   5
4    1   7
5    0   9
6    1   7
7    2   5
8    3   3
9    4   1
*/
