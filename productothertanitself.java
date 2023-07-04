import java.util.Arrays;

public class productothertanitself {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        nums = productExceptSelf(nums);
        for(int n:nums){
            System.out.println(n);
        }

    }

    static int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length];
        int right =1,left=1;
        for(int i = 0;i< nums.length;i++){
            array[i] = left;
            left*=nums[i];


        }
        for (int i = nums.length - 1; i >= 0; i--) {
            array[i] *= right;
            right *= nums[i];
        }

        return  array;


    }
}
