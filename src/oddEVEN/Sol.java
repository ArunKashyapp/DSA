package oddEVEN;

public class Sol {

    public static void main(String[] args) {
        int[] arr = {1};
        Sol s = new Sol();
        boolean ans = s.search(arr, 2);
        System.out.println(ans);
    }

    public boolean search(int[] nums, int target) {
        int arr[] = new int[nums.length];
        int pivot = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                pivot = i;
                break;
            }
        }
        int index = 0;
        for (int i = pivot; i < nums.length; i++) {
            arr[index++] = nums[i];
        }
        for (int i = 0; i < pivot; i++) {
            arr[index++] = nums[i];
        }

        return binarySearch(0, arr.length, arr, target);

    }

    boolean binarySearch(int l, int h, int[] arr, int target) {
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                return binarySearch(mid + 1, h, arr, target);

            } else {
                return binarySearch(l, mid - 1, arr, target);

            }
        }
        return false;
    }
}