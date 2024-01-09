package oddEVEN;

public class Hard {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 4 };
        int ans = findMin(arr);
        System.out.println(ans);
    }

    public static int findMin(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int pivot = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                pivot = nums[mid];
            } else if (nums[mid] > nums[mid-1]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        // if(nums[pivot] == nums[nums.length-1]){
        // ans = nums[0];
        // }

        return pivot;

    }

}
