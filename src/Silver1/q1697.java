package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1697 {
    static int [] count = new int[100001];
    static int n,k;

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if(n == k){
            System.out.println(0);
        }
        else {
            bfs(n);
        }
    }
    static void bfs(int num){
        Queue<Integer> que = new LinkedList<>();
        que.add(num);
        count[num] = 1;

        while(!que.isEmpty()){
            int now = que.poll();

            for(int i = 0;i<3;i++){
                int next = 0;

                if(i == 0){
                    next = now + 1;
                }else if(i == 1){
                    next = now - 1;
                }else if(i == 2){
                    next = now *2;
                }
                if(next == k){
                    System.out.println(count[now]);
                    return;
                }
                if(next >=0 && next< count.length && count[next] ==0){
                    que.add(next);
                    count[next] = count[now]+1;
                }
            }

        }

    }
}
