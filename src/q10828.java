import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10828 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];
        int index = -1;

        StringTokenizer st = null;


        for(int i =0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push":
                    index++;
                    arr[index] = Integer.parseInt(st.nextToken());
                    break;
                case "pop":
                    if(index ==-1){
                        sb.append(index).append("\n");
                    }else{
                        sb.append(arr[index]).append("\n");
                        index--;
                    }
                    break;
                case "size":
                    sb.append(index+1).append("\n");
                    break;
                case "empty":
                    if(index == -1)sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "top":
                    if(index ==-1){
                        sb.append(index).append("\n");
                    }else {
                        sb.append(arr[index]).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
