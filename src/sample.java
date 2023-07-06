
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sample {
    public static void main(String[] args) {
        int [] fruits = {-2,5,-3,6,8,-1,-5,3};
        int [] dp = new int[fruits.length];

        dp[0] = fruits[0];
        int answer = dp[0];
        for (int i = 1; i <dp.length; i++) {
            dp[i] = Math.max(0,dp[i-1])+fruits[i];
            answer = Math.max(answer,dp[i]);
        }
        System.out.println(answer);

        ArrayList arrayList = new ArrayList();

    }
}

/*
    int [] arr = {10,1,5};
    int n = 5;
    int index = 0;
    int answer = 0;
        Arrays.sort(arr);
                while (index< arr.length && answer<=n){
        if(arr[index] <= n){
        answer = arr[index];
        }else {
        break;
        }
        index++;
        }
        System.out.println(answer);*/
/*
int [] arr ={2,6,10};
        int n = 6;
        int index = 0;
        int answer = -1;

        Arrays.sort(arr);
        while (index <arr.length){
            if(arr[index] >= n){
                answer = arr[index];
                break;
            }
            index++;
        }
        System.out.println(answer);

* */

/*
int [] people = {45,50,51,49,90,70};
        int limit = 100;
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        while(left<=right){
            if(people[left]+people[right] <= limit){
                answer++;
                left++;
                right--;
            }else{
                answer++;
                right--;
            }
        }
        System.out.println(answer);
 */

/*
int [] A = {1,2,3,4,5};
        int answer = 0;
        Arrays.sort(A);
        int mid = A.length/2;
        int [] left = Arrays.copyOfRange(A, 0, mid);
        int [] right = Arrays.copyOfRange(A, mid, A.length);
        int index_l = left.length-1;
        int index_r = 0;
        for (int i = 1; i <= A.length; i++) {
            if(i%2 ==1){
                answer += right[index_r]*i;
                index_r++;
            }else{
                answer -= left[index_l]*i;
                index_l--;
            }
        }
        System.out.println(answer);
* */

/*
int A = 12345;
        int [] money = {50_000,10_000,5_000,1_000,500,100,50,10,5,1};
        int answer = 0;
        for (int i = 0; i < money.length; i++) {
            if(A >= money[i]){
                int q = A/money[i];
                answer += q;
                A %= money[i];
            }
        }
        System.out.println(answer);
 */