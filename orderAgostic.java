public class orderAgostic {

    public static void main(String[] args) {

        int[] arr= {5,4,3,2,1};
        System.out.println(index(arr,0));

    }


    static  int index(int arr[],int target){

        int start = 0;
        int end = arr.length -1;

        boolean isAsend = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end -start)/2;

            if(arr[mid] == target){
                return  mid;
            }
            if(isAsend){
                if(arr[mid] < target){
                    start = mid +1;
                }
                else {
                    end = mid - 1;
                }

            }
            else {
                if(arr[mid] > target){
                    start = mid +1;
                }
                else {
                    end = mid - 1;
                }
            }



        }



        return  -1;

    }
}
