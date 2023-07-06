package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q9012{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<n;i++){
            Stack<String> stack = new Stack<>();
            st = new StringTokenizer(br.readLine());
            String yn = null;

            String s = st.nextToken();

            for(int k=0;k<s.length();k++){
                char c = s.charAt(k);
                if(c =='('){
                    stack.push("(");
                }else{
                    if(stack.empty()){
                        yn = "NO";
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.empty() && yn == null){
                yn = "YES";
            }else{
                yn = "NO";
            }
            sb.append(yn).append("\n");
        }
        System.out.println(sb);
    }
}
