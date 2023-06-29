package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class q1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();//default로 가장 작은 숫자가 우선 나오는 자료구조

        for (int i = 0; i < N; i++) {
            priorityQueue.add(Long.parseLong(br.readLine()));
        }

        long answer = 0;

        while(priorityQueue.size() > 1){
            long A = priorityQueue.poll();
            long B = priorityQueue.poll();

            answer += A+B;
            priorityQueue.add(A+B);
        }
        System.out.println(answer);
    }
}
