package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q42885 {
    public static void main(String[] args) {
        int [] people = {70, 50, 80 ,50};
        int limit = 100;
        int answer = 0;
        Arrays.sort(people);

        int min = 0;
        int max = people.length-1;
        while (min<=max){
            if(people[min]+people[max] <= limit){//같이 탑승
                min++;
                max--;
                answer++;
            }else {
                max--;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
