import java.util.Scanner;

public class q5534 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String name = sc.next();
        String[] board = new String[n];
        for(int i=0;i<n;i++){
            board[i] = sc.next();
        }

        System.out.println(n+" "+name);
        for(String s:board){
            System.out.println(s);
        }
        sc.close();
    }
}
