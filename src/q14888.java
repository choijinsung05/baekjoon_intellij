import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q14888 {
    static int max_num = Integer.MIN_VALUE;
    static int min_num = Integer.MAX_VALUE;
    static int [] oper = new int[4];
    static int [] number;
    static int n;
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        number = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0;i<n;i++){
            number[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<4;i++){
            oper[i] = Integer.parseInt(st.nextToken());
        }
        dfs(number[0],1);

        System.out.println(max_num);
        System.out.println(min_num);
    }
    static void dfs(int num,int count){
        if(count == n){
            max_num = Math.max(max_num, num);
            min_num = Math.min(min_num, num);
            return;
        }
        for(int i = 0; i<4;i++){
            if(oper[i] >0){
                oper[i]--;//연산사 사용
                switch (i){
                    case 0://덧셈
                        dfs(num + number[count],count+1);
                        break;
                    case 1://뺄셈
                        dfs(num - number[count],count+1);
                        break;
                    case 2://곱하기
                        dfs(num * number[count],count+1);
                        break;
                    case 3://나누기
                        dfs(num / number[count],count+1);
                        break;
                }
                oper[i]++;//반환
            }
        }

    }
}
