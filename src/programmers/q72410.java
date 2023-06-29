package programmers;

public class q72410 {
    public static void main(String[] args) {

        String s = "...!@BaT#*..y.abcdefghijklm";

        String answer = s.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");

        if(answer.length() == 0){
            answer += 'a';
        }
        if(answer.length() >=16){
            answer.substring(0,15).replace("[.]$", "");
        }
        if(answer.length() <= 2){
            while (answer.length() < 3){
                answer += answer.charAt(answer.length()-1);
            }
        }

    }
}
