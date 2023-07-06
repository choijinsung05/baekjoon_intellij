package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1158 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }

        while(queue.size()!=1){
            for(int i =0;i<k-1;i++){
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()+", ");
        }
        sb.append(queue.poll()+">");
        System.out.println(sb);
    }
}