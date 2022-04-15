import java.util.Scanner;

public class q1157 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int index = 0;
        int count = 0;
        int max_num = 0;
        char answer = 'A';
        //문자열 대문자로 바꾸는 방법 알아두기
        //word.toUpperCase();

        int[] alphabet =new int[26];
        for(int i =0;i<word.length(); i++) {//charat에 대해서 알아둘것
            char c = word.charAt(i);
            int alpha = (c - 'A') % 32;
            alphabet[alpha] += 1;
        }
        for(int i = 0;i<alphabet.length;i++){
            if(max_num<alphabet[i]){
                index = i;
                count = 1;
                max_num = alphabet[i];
            }else if(max_num == alphabet[i]){
                index = i;
                count++;
            }
        }
        if(count >1) System.out.println("?");
        if(count == 1) System.out.println((char)(index+65));//형변환 하는 방법 숙지하기

        sc.close();
    }
}
