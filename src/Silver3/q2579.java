package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2579 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] reward = new int[n+1];//보상값
        int [] step_2 = new int[n+1];//두계단 올라온 값
        int [] step_1 = new int[n+1];//한계단 올라온 값


        reward[1] = Integer.parseInt(br.readLine());
        step_2[1] = reward[1];
        step_1[1] = reward[1];
        for(int i = 2;i<=n;i++){
            reward[i] = Integer.parseInt(br.readLine());

            step_2[i] =  reward[i] + Math.max(step_1[i-2],step_2[i-2]);
            step_1[i] = reward[i] + step_2[i-1];
        }
        System.out.println(Math.max(step_2[n],step_1[n]));
    }
}

