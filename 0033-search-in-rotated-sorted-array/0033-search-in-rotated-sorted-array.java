class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {//means mid lies in the rotated aage shifted vla part
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;//agr uss half mr target exist krta hai 
                } else {//if not move to next half
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    //means mid lies in the rotated peeche vla part
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}