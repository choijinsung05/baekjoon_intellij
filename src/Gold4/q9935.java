package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String search = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            boolean isSame = true;

            if(stack.size() >= search.length()){
                for (int j = 0; j < search.length(); j++) {
                    if(stack.get(stack.size()-search.length()+j) != search.charAt(j)){
                        isSame = false;
                        break;
                    }
                }
                if (isSame){
                    for (int j = 0; j < search.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack){
            sb.append(c);
        }
        System.out.println(sb.length() > 0 ? sb : "FRULA");
    }
}
