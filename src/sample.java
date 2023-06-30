import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sample {
    static int n,m,k;
    static int [] arr;
    static boolean [] visited;
    static Integer [] B;
    static int answer;
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int K = 3;
        n = A.length;
        m = 2;
        k = K;
        visited = new boolean[n+1];
        arr = new int[m];
        B = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(B, Collections.reverseOrder());
        permutation(0);
        System.out.println(answer);
    }
    static void permutation(int cnt) {
        if (cnt == m) {
            if(--k == 0) {
                int num = 1;
                for (int i = arr.length-1; i >= 0; i--) {
                    answer += arr[i] * num;
                    num *= 10;
                }
            }
            return;
        }
        for (int i=0;i<B.length;i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[cnt] = B[i];
                permutation(cnt + 1);
                visited[i] = false;
            }
        }
    }
}
/*
        int N = 25;
        int K = 2;

        int answer = IntStream.range(1, N+1)
                .mapToLong(i -> Stream.of(String.valueOf(i).split(""))
                        .mapToInt(Integer::parseInt)
                        .filter(num -> num == K).count())
                .mapToInt(count -> (int) count).sum();
        System.out.println(answer);
*/

/*
int [] A = {1,2,3,4,5};

        Integer[] B = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(B, Collections.reverseOrder());

        for (int num : A){
            System.out.print(num+" ");
        }
*/

/*
        String S1 = "HelloWorld";
        String S2 = "WorldHello";

        S1 += S1;
        System.out.println(S1.contains(S2));
*/

//    String [] array = {"n","nav","nev"};
//    String s = "naver";
//
//    long count = Arrays.stream(array).filter(string -> s.startsWith(string)).count();
//        System.out.println(count);