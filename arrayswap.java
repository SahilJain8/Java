import java.util.Arrays;

public class arrayswap {




    public static void main(String[] args) {
        int[] arr = {1,2,3,4};


        int i =0;
        while(i<= arr.length-1){

            int temp =0;
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] =temp;
            i =i+2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
