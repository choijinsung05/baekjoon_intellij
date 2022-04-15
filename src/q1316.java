import java.util.Scanner;

public class q1316 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] word = new String[n];
        int answer = 0;
        for(int i =0; i<n;i++){
            word[i] = sc.next();
        }

        for(String s : word){
            int [] alpha = new int[26];
            int l = s.length();
            for(int i=0;i<l;i++){
                char c = s.charAt(i);
                int index = c-97;
                if(alpha[index] == 0){
                    alpha[index] +=1;
                }else if(s.charAt(i) == s.charAt(i-1))continue;
                else {
                    alpha[index] += 1;
                    answer--;
                    break;
                }
            }
            answer++;
        }
        System.out.println(answer);
        sc.close();
    }
}
