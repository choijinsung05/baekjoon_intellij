import java.util.Scanner;

public class q2941 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int answer = 0;
        for(int i = 0;i<s.length();i++){
            answer++;
            char c = s.charAt(i);
            if(i>0){
                if(c =='='){
                    if(s.charAt(i-1) =='c' ||s.charAt(i-1) =='s' || s.charAt(i-1) =='z' )answer--;
                    if(i>1){
                        if(s.charAt(i-1) =='z'&& s.charAt(i-2) =='d' ) answer--;
                    }
                }
                if(c =='-'){
                    if(s.charAt(i-1) =='c' ||s.charAt(i-1) =='d')answer--;
                }
                if(c == 'j'){
                    if(s.charAt(i-1) =='l' ||s.charAt(i-1) =='n')answer--;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
