import java.util.Arrays;
import java.util.Scanner;

public class q7568 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][]human = new int[n][2];
        int[] rank = new int[n];
        Arrays.fill(rank,1);

        for(int i = 0;i<n;i++){
            human[i][0] = sc.nextInt();
            human[i][1] = sc.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(human[i][0] > human[j][0] && human[i][1] > human[j][1]){
                    rank[j] +=1;
                }else if(human[i][0] < human[j][0] && human[i][1] < human[j][1]){
                    rank[i] +=1;
                }
            }
        }
        for(int i: rank){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
