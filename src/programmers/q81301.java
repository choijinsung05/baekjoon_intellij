package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class q81301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s  = br.readLine();

        Map<String, String> map = Map.of(
            "one","1" ,
            "zero","0",
            "two","2",
            "three","3",
            "four","4",
            "five","5",
            "six","6",
            "seven","7",
            "eight","8",
            "nine","9"
        );

        for (String key : map.keySet()){
            if (s.contains(key)) s = s.replace(key, map.get(key));
        }
        System.out.println(s);
    }
}
