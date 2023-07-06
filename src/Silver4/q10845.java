package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q10845 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        int last = 0;

        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            int num;

            switch (s){
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    last = num;
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        num = -1;
                    }else {
                        num = queue.poll();
                    }sb.append(num).append("\n");
                    break;
                case "size":
                    num = queue.size();
                    sb.append(num).append("\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        num = 1;
                    }else{
                        num = 0;
                    }sb.append(num).append("\n");
                    break;
                case "front":
                    if(queue.isEmpty()){
                        num = -1;
                    }else {
                        num = queue.peek();
                    }sb.append(num).append("\n");
                    break;
                case "back":
                    if(queue.isEmpty()){
                        num =-1;
                    }else{
                        num = last;
                    }sb.append(num).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
