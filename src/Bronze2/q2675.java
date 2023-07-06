package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2675 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = null;

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());

            int count = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                for(int k =0;k<count;k++){
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
