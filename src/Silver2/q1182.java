package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1182 {
    static int N,S;
    static int [] nums;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = new int[N];
        answer = 0;

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        answer = S == 0 ? answer-1:answer;
        System.out.println(answer);
    }
    static void dfs(int index, int sum){
        if(index == N){//종료조건 마지막 인덱스까지 왔을떄 크기를 확인
            if(sum == S){// 필요한 합과 같으면 증가시킨다.
                answer++;
            }
            return;
        }else{//다음 분기
            dfs(index+1,sum+nums[index]);//값을 들고갈지
            dfs(index+1,sum);//안들고갈지
        }
    }
}
/*
n : 5 s : 0일때
-7  -3  -2  5   8
 o   o   o  o   o >  1 x
                x > -7 x
            x   o > -4 x
      ...
 x   o   o  o   x >  0 o
            x   x > -5 x
      ...
 x   x   x  x   x >  0 o(하지만 공집합이므로 제외해야댐)
*/