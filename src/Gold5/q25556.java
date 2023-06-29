package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class q25556 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");

        int sizeOfStacks = 4;
        ArrayList<Stack<Integer>> stacks = new ArrayList<>();
        for (int i = 0; i < sizeOfStacks; i++) {
            stacks.add(new Stack<>());
            stacks.get(i).push(0);
        }
        Boolean clean = true;

        while (st.hasMoreTokens()){
            int element = Integer.parseInt(st.nextToken());

            for (int i = 0; i < sizeOfStacks; i++) {
                if(stacks.get(i).peek() < element){
                    stacks.get(i).push(element);
                    element = 0;
                    break;
                }
            }
            if (element != 0){
                clean = false;
                break;
            }
        }
        System.out.println(clean ? "YES" : "NO");
    }
}
