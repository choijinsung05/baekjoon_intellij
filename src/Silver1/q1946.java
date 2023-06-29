package Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class q1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-->0){
            int N = Integer.parseInt(br.readLine());
            int answer = 1;

            ArrayList<Grade> grades = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine()," ");
                grades.add(new Grade(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
            }
            Collections.sort(grades);

            int interview_min_rank = grades.get(0).interview_rank;
            for (int i = 1; i < grades.size(); i++) {
                if(grades.get(i).interview_rank < interview_min_rank){
                    answer++;
                    interview_min_rank = grades.get(i).interview_rank;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
class Grade implements Comparable<Grade>{
    int document_rank;
    int interview_rank;

    public Grade(int document_rank, int interview_rank) {
        this.document_rank = document_rank;
        this.interview_rank = interview_rank;
    }
    @Override
    public int compareTo(Grade o) {
        return this.document_rank - o.document_rank;
    }
}