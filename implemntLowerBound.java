public class implemntLowerBound {


    public static void main(String[] args) {
        int[] arr ={1,2,8,10,11,12,19};
        int ans = lowerindex(arr,5);
        System.out.println(ans);
    }

    static   int lowerindex(int[] arr,int target){
        if (arr[0] > target){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid -1;
            } else  {
                start = mid+1;

            }
        }

        return end;
    }

}
