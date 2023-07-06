package Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        Arrays.sort(arr);//mergesort(arr);메모리초과
        System.out.println(search(arr, x));
    }

    public static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum > x) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }

    public static void mergesort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int index_s = start;
        int index_e = mid + 1;
        int index = start;
        int[] temp = new int[end + 1];
        while (index_s <= mid && index_e <= end) {
            if (arr[index_s] <= arr[index_e]) {
                temp[index++] = arr[index_s++];
            } else {
                temp[index++] = arr[index_e++];
            }
        }
        if (index_s > mid) {
            for (int i = index_e; i <= end; i++) {
                temp[index++] = arr[i];
            }
        } else {
            for (int i = index_s; i <= mid; i++) {
                temp[index++] = arr[i];
            }
        }
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }
}