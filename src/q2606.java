import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q2606 {
    static int computer;//컴퓨터개수
    static int n;//간선의 개수
    static List<Integer>[] line;//연결상태
    static int index = 0;
    static int[] visited = new int[101];

    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = null;
        computer = Integer.parseInt(input);

        n = Integer.parseInt(br.readLine());


        line = new ArrayList[computer + 1];
        for(int i =1;i<=computer;i++) {
            line[i] = new ArrayList<Integer>();
        }
        String[] inputs = new String[2];
        for (int i = 1; i <= n; i++) {
            input = br.readLine();
            inputs = input.split(" ");
            line[Integer.parseInt(inputs[0])].add(Integer.parseInt(inputs[1]));
            line[Integer.parseInt(inputs[1])].add(Integer.parseInt(inputs[0]));
        }
        for(int i = 1;i<=computer;i++){
            Collections.sort(line[i]);
        }
        bfs(1);
        System.out.println(index-1);
    }
    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = 1;

        index = 1;
        while (queue.isEmpty() == false) {
            node = queue.remove();
            for (int next : line[node]) {
                if (visited[next] == 0) {
                    index++; visited[next] = 1;
                    queue.add(next);
                }
            }
        }
    }
}
