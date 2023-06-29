package Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        int answer = 0;

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(!stack.isEmpty()){
                if (stack.peek() == c){
                    answer += 5;
                }else{
                    answer += 10;
                    stack.push(c);
                }
            }else{
                stack.push(c);
                answer += 10;
            }
        }
        System.out.println(answer);
    }
}
