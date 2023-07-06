package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class q21773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int T = Integer.parseInt(st.nextToken());//시간
        int n = Integer.parseInt(st.nextToken());//프로세스 종류

        PriorityQueue<Process> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int id = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            int priority = Integer.parseInt(st.nextToken());
            Process process = new Process(id,time,priority);
            priorityQueue.add(process);
        }
        StringBuilder sb = new StringBuilder();

        while (T-->0){
            if(priorityQueue.isEmpty()){
                break;
            }else{
                Process execution_process = priorityQueue.poll();
                sb.append(execution_process.id).append("\n");
                execution_process.time--;
                execution_process.priority--;
                if(execution_process.time >0){
                    priorityQueue.add(execution_process);
                }
            }
        }
        System.out.println(sb);
    }
}
class Process implements Comparable<Process>{
    int id;
    int time;
    int priority;

    public Process(int id, int time, int priority) {
        this.id = id;
        this.time = time;
        this.priority = priority;
    }

    @Override
    public int compareTo(Process o) {
        if(this.priority == o.priority){
            return this.id - o.id;
        }
        return o.priority-this.priority;
    }
}