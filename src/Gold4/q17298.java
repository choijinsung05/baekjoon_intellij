package Gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {

            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){ //스택 비어있지 않고 스택 맨위에 보다 큰 수 많났을때 값 변경
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);//자기자신 추가
        }
        while (!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : arr){
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
/*
* 3 5 2 7
*
* 9 5 4 7
* */