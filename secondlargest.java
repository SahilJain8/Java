public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {1,7,4,7,7,5};

        int largst = arr[0];
        int smallest = Integer.MIN_VALUE;
    for(int i =1;i<arr.length;i++){
        if(largst < arr[i]){
            smallest = largst;
            largst = arr[i];
        } else if (smallest < arr[i] & largst> arr[i]) {
            smallest = arr[i];
        }

    }
    System.out.println(smallest);

    }
}
