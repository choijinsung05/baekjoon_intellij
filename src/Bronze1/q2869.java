package Bronze1;

import java.util.Scanner;

public class q2869 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int day = (v-b)/(a-b);

        if((v-b)%(a-b) != 0) day++;

        System.out.println(day);
    }
}
/*
임의의 시간 n 동안 올라가는 높이
(a-b)(n-1) + a = h
(a-b)(n-1) = h-a
n-1 = (h-a)/(a-b)
n = (h-a)+(a-b) / (a-b)
n = (h-b) / (a-b)

java8 통과 java15 불통 그 이유는???
*/