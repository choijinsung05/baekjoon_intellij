package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class q1068 {
    static int N, Delete, answer =0;
    static Node[] nodes;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nodes = new Node[N+1];

        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i);
        }

        int root = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int parent = Integer.parseInt(st.nextToken());

            if(parent == -1) {
                root = i;
            }else{
                nodes[parent].childs.add(nodes[i]);
            }
        }
        Delete = Integer.parseInt(br.readLine());
        if(Delete != root){
            deleteNode(root);
            dfs(root);
        }
        System.out.println(answer);
    }
    static void deleteNode(int index){
        for (Node child : nodes[index].childs){
            if(child.index == Delete){
                nodes[index].childs.remove(child);
                return;
            }
            deleteNode(child.index);
        }
    }

    static void dfs(int index){
        if(nodes[index].childs.size() == 0){
            answer++;
            return;
        }
        for (Node child : nodes[index].childs){
            dfs(child.index);
        }
    }

    static class Node{
        int index;
        ArrayList<Node> childs = new ArrayList<>();

        public Node(int index) {
            this.index = index;
        }
    }
}

