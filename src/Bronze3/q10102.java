package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10102 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;
        for(int i=0;i<N;i++){
            if(s.charAt(i) == 'A') answer++;
            else{
                answer--;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(answer>0) sb.append("A");
        else if (answer == 0) sb.append("Tie");
        else sb.append("B");

        System.out.println(sb);
    }
}
