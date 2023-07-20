package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class point{
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class q15686 {
    static int N,M;
    static ArrayList<point> house;
    static ArrayList<point> chicken;
    static Boolean [] open;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        house = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int x = 0; x < N; x++) {
                int num = Integer.parseInt(st.nextToken());
                if(num == 1){
                    house.add(new point(x,y));
                }else if(num == 2){
                    chicken.add(new point(x,y));
                }
            }
        }
        open = new Boolean[chicken.size()];
        Arrays.fill(open,false);// Bollean으로 쓰면 객체 생성시 널 반환 해버리네
        answer = Integer.MAX_VALUE;
        dfs(0,0);

        System.out.println(answer);
    }
    public static void dfs(int index, int size){
        if(size == M){//종료조건
            //각 집별 오픈한 치킨집과의 최소거리를 뽑아야댐
            int chickenDistance = getSumDistance();
            answer = Math.min(answer,chickenDistance);
        }
        //탐색 조합이므로 이전까지 다 확인할 필요 없음 {1, 5} == {5, 1}
        for (int i = index; i < chicken.size(); i++) {
            open[i] = true;
            dfs(i+1,size+1);
            open[i] = false;
        }
    }
    public static int getSumDistance(){
        int result = 0;
        for (int i = 0; i < house.size(); i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < chicken.size(); j++) {
                if(open[j]) {
                    int distance = getDistance(house.get(i), chicken.get(j));
                    temp = Math.min(temp, distance);
                }
            }
            result += temp;
        }
        return result;
    }
    public static int getDistance(point H, point C) {
        int distance = Math.abs(H.x-C.x)+Math.abs(H.y-C.y);
        return distance;
    }
}
