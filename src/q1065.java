import java.util.Scanner;

public class q1065 {//한수 : 각자리수가 등차수열인 값
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//n <1000

        int answer =0;

        for(int i=1;i<=n;i++){
            if(i<=9) answer++;
            else if(i<=99){
                if( (i/10) != (i%10))answer++;
            }else if(i<=999){
                int n1 = i%10;
                int n2 = (i%100)/10;
                int n3 = i/100;
                if(n1-n2 == n2-n3)answer++;
            }
        }


        sc.close();
    }
}
