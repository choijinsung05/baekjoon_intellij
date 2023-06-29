package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-->0){
            String s = br.readLine();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();


            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                switch (c){
                    case '<':
                        if(!left.isEmpty()){
                            right.push(left.pop());
                        }
                        break;
                    case '>':
                        if(!right.isEmpty()){
                            left.push(right.pop());
                        }
                        break;
                    case '-':
                        if(!left.isEmpty())left.pop();
                        break;
                    default:
                        left.push(c);
                        break;
                }
            }
            while (!left.isEmpty()){
                right.push(left.pop());
            }
            while (!right.isEmpty()){
                sb.append(right.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
/*
2
    <<BP<A>>Cd-
    ThIsIsS3Cr3t
*/
