import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2775 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int [][] people = new int[15][15];

        for(int i = 1;i<15;i++){
            people[0][i] = i;
            people[i][1] = 1;
        }
        for(int i = 1;i<15;i++){
            for(int j = 2;j<15;j++){
                people[i][j] = people[i][j-1] + people[i-1][j];
            }
        }

        StringBuilder sb = new StringBuilder();

        while (T>0){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(people[k][n] + "\n");

            T--;
        }
        System.out.println(sb);
    }
}
