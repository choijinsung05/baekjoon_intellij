import java.util.*;

public class q16951 {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    int answer = 0;
    int N = sc.nextInt();
    int K = sc.nextInt();
    int [] arr = new int[N]; //배열 어떻게 선언하는지 다시 확인할것
    for (int i = 0;i<N;i++){
        arr[i] = sc.nextInt();
    }
    int a = arr[0];
    for(int i =N-1 ; i>0; i--){
        if (arr[i]-arr[i-1] == K){
        }else{
            answer++;
        }
    }
    System.out.println(answer);
    sc.close();
    }
}
