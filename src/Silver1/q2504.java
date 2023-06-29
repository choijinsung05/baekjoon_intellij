package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Stack<Character> stack = new Stack<>();
        int cal = 1; //괄호가 열리면 영향을 주고 닫히면 영향을 안준다.
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '(':
                    stack.push('(');
                    cal *= 2;
                    break;
                case '[':
                    stack.push('[');
                    cal *= 3;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.peek() !='('){
                        flag = false;
                        break;
                    }
                    if (s.charAt(i-1) == '(') answer += cal;
                    stack.pop();
                    cal /= 2;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.peek() !='['){ // 예외 ]~~ (]
                        flag = false;
                        break;
                    }
                    if (s.charAt(i-1) == '[') answer += cal;
                    stack.pop();
                    cal /= 3;
                    break;
            }
        }
        System.out.println(!stack.isEmpty() || !flag ? 0 : answer);
    }
}
/*
        (  (   )   [    [    ]   ]  )  (  [   ] )
cal     2 2*2  2  2*3 2*3*3 2*3  2  1  2 2*3  2 1
answer      +4           +18               +6
*/
