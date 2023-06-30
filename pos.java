public class pos {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int idex = search(arr,4);
        System.out.println(idex);


    }


   static int search(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length;
        while (start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target && target < nums[end]){
                start = mid+1;
            } else if (nums[mid] < target && target > nums[start]) {
                end = mid-1;

            }
            if (nums[mid] == target){
                return  mid;
            }


        }


        return index;
   }


    }
