public class replacewithlargestatright {
    public static void main(String[] args) {

        int[] nums = {17,18,5,4,6,1};
        nums = replaceElements(nums);
        for(int n:nums){
            System.out.println(n);
        }


    }

   static int[] replaceElements(int[] arr) {
        int prev = -1;
        int temp = 0;
        for(int i = arr.length-1;i>=0;i--){
            temp = arr[i];
            arr[i] = prev;

            if(temp > prev){
                prev = temp;
            }
        }
        return  arr;
    }
}
