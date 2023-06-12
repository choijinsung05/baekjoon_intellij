package Silver2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;

        String str = br.readLine();

        Stack<Character> left = new Stack<Character>();
        Stack<Character> right = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            left.push(str.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());

        while(M-->0){
            st = new StringTokenizer(br.readLine()," ");

            char c = st.nextToken().charAt(0);

           switch (c){
               case 'L':
                   if(!left.isEmpty())
                       right.push(left.pop());
                   break;
               case 'D':
                   if(!right.isEmpty())
                       left.push(right.pop());
                   break;
               case 'B':
                   if(!left.isEmpty())
                       left.pop();
                   break;
               case 'P':
                   char t = st.nextToken().charAt(0);
                   left.push(t);
                   break;
               default:
                   break;
           }

        }
        StringBuilder sb = new StringBuilder();
        while(!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()){
            sb.append(right.pop());
        }
        System.out.println(sb);

    }
}
