import java.util.Scanner;

public class q2839 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[5001];
        arr[3] = 1;
        arr[4] =-1;
        arr[5] = 1;
        arr[6] = 2;
        arr[7] = -1;
        for(int i=8;i<=n;i++){
            int a = arr[i-3];
            int b = arr[i-5];
            if(a >0 && b>0){
                arr[i] = Math.min(a,b) +1;
            }else{
                arr[i] = Math.max(a,b) +1;
            }
        }
        System.out.println(arr[n]);

        sc.close();
    }
}
