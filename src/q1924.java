import java.util.Scanner;

public class q1924 {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         String answer = "";

         int a = sc.nextInt();
         int b = sc.nextInt();


         String [] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
         int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
         int today = 0;

         for (int i = 0; i<a-1;i++){
                today += month[i];
         }
         today += b-1;
         answer = days[today % 7];

         System.out.println(answer);

         sc.close();
     }
}

