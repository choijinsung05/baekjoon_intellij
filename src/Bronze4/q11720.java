package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q11720 {
    public static void main(String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        int answer = 0;
        for(int i =0; i<n;i++){
            int num = s.charAt(i)-'0';//스트링을 문자로 바꿀땐 charAt 문자를 숫자로 바꿀땐 아스키코드 이용
            answer += num;
        }
        System.out.println(answer);
    }
}
