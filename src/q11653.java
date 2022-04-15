import java.util.*;
public class q11653 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 2;

        while(n>=k){
            if(n%k ==0){
                System.out.println(k);
                n = n/k;
            }else{
                k++;
            }
        }
        sc.close();
    }
}
