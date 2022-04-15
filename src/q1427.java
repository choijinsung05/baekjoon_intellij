import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//숫자 정렬 위해서 문자열로 받기? 리스트 배열 확인할게 많네요
public class q1427 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();


        Arrays.sort(arr);

        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        br.close();
    }
}
