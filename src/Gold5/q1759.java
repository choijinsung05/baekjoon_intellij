package Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1759 {
    static int L;//암호의 길이
    static int C;//암호의 문자 종류의 개수
    static char [] alpabet;//문자 종류 리스트
    static char [] temp;//문자 저장공간
    static String s = "aeiou";
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        alpabet = new char[C];
        temp = new char[L];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < C; i++) {
            alpabet[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(alpabet);
        sb = new StringBuilder();

        makeCode(0,0);
        System.out.println(sb);
    }
    public static void makeCode(int index, int size){
        if(size == L){//암호 완성
           if(isCorrect()){
                sb.append(temp).append("\n");
           }
           return;
        }
        for(int i = index;i<C;i++){
            temp[size] = alpabet[i];
            makeCode(i+1,size+1);
        }
    }
    public static boolean isCorrect(){//자음 2개 모음1개 가지고있는지 확인
        int consonant = 0;//자음
        int vowel = 0;//모음

        for (char c : temp){
            if(s.contains(String.valueOf(c))){
                vowel++;
            }else{
                consonant++;
            }
        }
        if(vowel >= 1 && consonant >= 2){
            return true;
        }else{
            return false;
        }
    }
}
/*
입력
4 6
a t c i s w
출력
acis
acit
aciw
acst
acsw
actw
aist
aisw
aitw
astw
cist
cisw
citw
istw
*/