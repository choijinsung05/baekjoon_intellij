import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q10773 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i<n;i++){
            int num = Integer.parseInt(br.readLine());

            if(stack.empty()){
                stack.push(num);
                sum += num;
            }else{
                if(num != 0){
                    stack.push(num);
                    sum += num;
                }else{
                    num = stack.pop();
                    sum -= num;
                }
            }
        }
        System.out.println(sum);
    }
}
