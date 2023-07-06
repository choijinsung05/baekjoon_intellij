package Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            String s = S.substring(i);
            if(isPalindrome(s)){
                break;
            }
            count++;
        }
        count += S.length();
        System.out.println(count);

    }
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        while (start<= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
