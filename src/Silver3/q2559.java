package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2559 {
    static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(findMax1(arr));
        System.out.println(findMax2(arr));
        System.out.println(findMax3(arr));
    }
    private static int findMax1(int[] arr) {//슬라이딩 윈도우
        int i = 0;
        int sum = 0;
        while (i<K) sum += arr[i++];
        int max = sum;
        while (i<N) {
            sum += arr[i]-arr[i-K];
            if (max < sum) max = sum;
            i++;
        }
        return max;
    }
    private static int findMax2(int[] arr) {// 누적합
        int [] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = K; i < N; i++) {
            int temp = sum[i]-sum[i-K];
            max = Math.max(max, temp);
        }
        return max;
    }
    private static int findMax3(int[] arr) {//투포인터
        int sum = 0;
        for (int i = 0; i < K; i++) sum+=arr[i];
        int max = sum;
        for (int i = K, j=0; i < N; i++, j++) {
            sum+=arr[i]-arr[j];
            if (max < sum) max = sum;
        }
        return max;
    }
}
