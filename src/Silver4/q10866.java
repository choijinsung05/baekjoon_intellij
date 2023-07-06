package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q10866 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st = null;

        StringBuilder sb = new StringBuilder();

        for(int i =1;i<=n;i++){
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            int num = 0;

            switch (s){
                case "push_front":
                    num = Integer.parseInt(st.nextToken());
                    deque.offerFirst(num);
                    break;
                case "push_back":
                    num = Integer.parseInt(st.nextToken());
                    deque.offerLast(num);
                    break;
                case "pop_front":
                    if(deque.size() != 0) {
                        sb.append(deque.pollFirst()+"\n");
                    }else{
                        sb.append("-1" +"\n");
                    }
                    break;
                case "pop_back":
                    if(deque.size() != 0) {
                        sb.append(deque.pollLast()+"\n");
                    }else{
                        sb.append("-1"+"\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()+"\n");
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if(deque.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(deque.peekFirst()+"\n");
                    }
                    break;
                case "back":
                    if(deque.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(deque.peekLast()+"\n");
                    }
                    break;
            }
        }
        System.out.println(sb);

    }

}
