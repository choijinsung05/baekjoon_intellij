package Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();

        while(n-->0){
            st = new StringTokenizer(br.readLine()," ");
            String key = st.nextToken();
            String value = st.nextToken();
            if(map.containsKey(key)){
                map.remove(key);
            }else {
                map.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (String name : list){
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
}
