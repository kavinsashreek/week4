import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    static void rotateRight(int[] nums, int k) {
        if (nums.length == 0) return;
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.print("Enter rotation count: ");
        int k = sc.nextInt();

        rotateRight(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
        sc.close();
    }
}