package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = Integer.parseInt(br.readLine());
        while(true){
            String str = br.readLine();

            if(str.equals("=")){
                break;
            }else{
                switch (str){
                    case "+":
                        answer += Integer.parseInt(br.readLine());
                        break;
                    case "-":
                        answer -= Integer.parseInt(br.readLine());
                        break;
                    case "*":
                        answer *= Integer.parseInt(br.readLine());
                        break;
                    case "/":
                        answer /= Integer.parseInt(br.readLine());
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(answer);
    }
}
