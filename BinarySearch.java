import java.util.Arrays;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // int[] arr = { 10, 20, 30, 40, 50, 60, 70, 72, 76, 80 };
        System.out.print("Enter the length of the array: ");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int[] arr = new int[l];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < l; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the element you want to search ");
        int target = input.nextInt();
        System.out.print("Element found at index");
        System.out.println(Search(arr, target));

    }

    public static int Search(int[] arr, int ele) {
        int li = 0;
        int hi = arr.length - 1;
        while (li <= hi) {
            int mid = (li + hi) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] > ele) {
                hi = mid - 1;
            } else {
                li = mid + 1;
            }
        }
        return -1;
    }
}

// Output
// [10, 20, 30, 40, 50, 60, 70, 72, 76, 80]
// 9
