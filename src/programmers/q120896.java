package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class q120896 {
    public static void main(String[] args) {
        String s = "abcabcadc";

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,2);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : map.keySet()){
            if(map.get(c) == 1) {
                sb.append(c);
            }
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
}
