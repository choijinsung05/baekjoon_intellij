package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10797 {
    public static void main(String [] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine())%10;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int count = 0;

        for(int i = 0;i<5;i++){
            int car = Integer.parseInt(st.nextToken());
            if(car ==  n)count++;
        }
        System.out.println(count);
    }
}
