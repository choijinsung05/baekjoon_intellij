package Silver4;

import java.util.*;
public class q13268 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 1;//방향 1: 정방향 0: 역방향
        int con = 1;//찍어야할 콘
        int answer = 0;//현재위치
        n %= 100;
        for (int k = 1; k <= n; k++) {
            if (d == 1) {
                if (k % 5 == 1) {
                    answer++;
                }
                if (k % 5 == 0 && answer == con) {
                    d = 0;
                    con++;
                }
            } else {
                if (k % 5 == 0) {
                    if (answer > 0) answer--;
                    if(answer == 0) d =1;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}