import java.util.Arrays;
import java.util.Scanner;

public class q1978 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        int max = 0;
        int answer = 0;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]) max = arr[i];
        }
        int [] sosu = new int[max+1];
        Arrays.fill(sosu,-1);

        for(int i =1;i<=max;i++){
            if(i == 1) {
                sosu[i-1] = 0;
                sosu[i] = 0;
            }
            if(sosu[i] == -1){
                sosu[i] = 1;
                int k = i;
                int m = 2;
                while(k*m<=max){
                    if(sosu[k*m] !=0){
                        sosu[k*m] = 0;
                    }
                    m++;
                }

            }
        }
        for(int num: arr)
            if(sosu[num] == 1) answer++;
        System.out.println(answer);
        sc.close();
    }
}
