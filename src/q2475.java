import java.util.Scanner;

public class q2475 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        for(int i = 0; i<5;i++){
            int n = sc.nextInt();
            n = (int) Math.pow(n,2);
            answer += n;
        }

        answer = answer%10;

        System.out.println(answer);
        sc.close();
    }
}
