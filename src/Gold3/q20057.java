package Gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q20057 {
    static int N;
    static int [][] A;
    static int [] d_x = {-1,0,1,0};//x축
    static int [] d_y = { 0,1,0,-1};//y축
    static int [] dSize = { 1, 1,2,2};
    static int [] ratio= {1,1,2,2,5,7,7,10,10};
    static int [][] dsx = {{ 1,1, 0,0,-2, 0,0,-1,-1},{-1, 1,-2, 2,0,-1,1,-1, 1},{-1,-1,0, 0,2,0, 0,1, 1},{1,-1,2,-2, 0,1,-1, 1,-1}};
    static int [][] dsy = {{-1,1,-2,2, 0,-1,1,-1, 1},{-1,-1, 0, 0,2, 0,0, 1, 1},{ 1,-1,2,-2,0,1,-1,1,-1},{1, 1,0, 0,-2,0, 0,-1,-1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = solution(N/2,N/2);
        System.out.println(result);
    }
    static int solution(int x, int y){
        int sandOutTotal = 0;

        int cur_x = x;
        int cur_y = y;

        while(true){
            for (int direction = 0; direction < 4; direction++) {
                for (int size = 0; size < dSize[direction]; size++) {
                    int next_x = cur_x+d_x[direction];
                    int next_y = cur_y+d_y[direction];

                    if(next_x<0 || next_y < 0 || next_x>=N || next_y>=N){
                        return sandOutTotal;
                    }
                    
                    int amountOfsand = A[next_y][next_x];
                    A[next_y][next_x] = 0;
                    int temp_sum = 0;

                    for (int scatter = 0; scatter < 9; scatter++) {
                        int scatter_x = next_x + dsx[direction][scatter];
                        int scatter_y = next_y + dsy[direction][scatter];
                        int scatter_amount = (amountOfsand*ratio[scatter])/100;

                        if(scatter_x<0 || scatter_y < 0 || scatter_x>=N || scatter_y>=N){
                            sandOutTotal += scatter_amount;
                        }else{
                            A[scatter_y][scatter_x] += scatter_amount;
                        }
                        temp_sum += scatter_amount;
                    }
                    int alpha_x = next_x+d_x[direction];
                    int alpha_y = next_y+d_y[direction];
                    int alpha_amount = amountOfsand-temp_sum;
                    if(alpha_x<0 || alpha_y < 0 || alpha_x>=N || alpha_y>=N){
                        sandOutTotal += alpha_amount;
                    }else{
                        A[alpha_y][alpha_x] += alpha_amount;
                    }

                    cur_x = next_x;
                    cur_y = next_y;
                }
            }
            for (int i = 0; i < 4; i++) {//토네이도 이동거리 증가
                dSize[i] += 2;
            }
        }
    }
}
