import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q4949 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = null;

        while(true){
            s = br.readLine();

            if(s.equals(".")){
                break;
            }
            sb.append(Y_N(s)+"\n");
        }
        System.out.println(sb);
    }
    public static String Y_N(String s){// class 선언하는거 더 봐야될듯 하다.
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if( c == '(' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){// Empty isEmpty 차이 딱히 상관없는듯 하다.
                    return "no";
                }else{
                    stack.pop();
                }
            }else if(c == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return "no";
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return "yes";
        }else{
            return "no";
        }
    }
}
