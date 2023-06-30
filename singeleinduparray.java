public class singeleinduparray {
    public static void main(String[] args) {

        int[] nums = {3,3,7,7,10,11,11};
        int ans = ele(nums);
        System.out.println(ans);

    }


    static int ele(int[] nums){

        int start = 0;
        int end = nums.length -1;
        int mid = start + (end - start)/2;
        while (start <= end){

             mid = start + (end - start)/2;

            if (nums[mid] == nums[mid-1] && mid%2!=0){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }


        return nums[mid];
    }
}
