import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1259 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        StringBuffer sbuffer = null;

        StringBuilder sb = new StringBuilder();
        while(n.compareTo("0") != 0){
            sbuffer = new StringBuffer(n);
            String rever = sbuffer.reverse().toString();

            if(n.equals(rever)){
                sb.append("yes\n");
            }else{
                sb.append("no\n");
            }
            n = br.readLine();
        }
        System.out.println(sb);
    }
}
