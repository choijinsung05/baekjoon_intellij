import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q1874 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int index = 0;

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while(n >0){
            int num = Integer.parseInt(br.readLine());//수열 입력

            if(num >index){//채운다.
                for(int i = index+1; i <= num; i++){
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                index = num;
            }

            else if(stack.peek() != num){//확인한다.
                System.out.println("NO");
                return;
            }

            stack.pop();//뺀다.
            sb.append("-").append("\n");

            n--;
        }
        System.out.println(sb);

    }
}
