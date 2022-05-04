import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1463 {//dp 문제 바텀업? 탑다운?? 뭐가 효율적일까?
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  n = Integer.parseInt(br.readLine());

        System.out.println(solve(n,0));
    }
    static int solve(int k,int count){
        if(k<2) return count;

        return Math.min(solve(k/2,count+1+k%2),solve(k/3,count+1+k%3));
    }
}
