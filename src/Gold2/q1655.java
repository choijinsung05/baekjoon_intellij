package Gold2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class q1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2-o1);// o1 > o2
        PriorityQueue<Integer> right = new PriorityQueue<>((o1, o2) -> o1-o2); // o1 < o2

        StringBuilder sb = new StringBuilder();
        while (N-->0){
            int num = Integer.parseInt(br.readLine());

            if(left.size() == right.size()){
                left.offer(num);
            }
            else{
                right.offer(num);
            }
            if(!left.isEmpty() && !right.isEmpty()){
                if (left.peek() > right.peek()){
                    int temp = left.poll();
                    left.offer(right.poll());
                    right.offer(temp);
                }
            }
            sb.append(left.peek() + "\n");
        }
        System.out.println(sb);
    }
}
