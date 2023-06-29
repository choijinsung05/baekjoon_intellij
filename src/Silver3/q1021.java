package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> deque = new LinkedList<>();

        int [] arr = new int[M];

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int num : arr){
            int target_index = deque.indexOf(num);
            int half_index = deque.size() % 2 == 0 ? deque.size()/2-1 : deque.size()/2;

            if(target_index <= half_index){
                for (int i = 0; i < target_index; i++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    answer++;
                }
            }else {
                for (int i = 0; i < deque.size() -target_index; i++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    answer++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(answer);

    }
}
