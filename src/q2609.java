import java.util.Scanner;

public class q2609 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int g = 0;
        int a = A;
        int b = B;
        if(a<b){
            int temp = b;
            b = a;
            a = temp;

        }
        while(g ==0){
            int r = a%b;
            if(r == 0){
                g = b;
            }else{
                a = b;
                b = r;
            }
        }
        a = A/g;
        b = B/g;

        System.out.println(g);
        System.out.println(g*a*b);
        sc.close();
    }
}
