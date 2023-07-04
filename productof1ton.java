public class productof1ton {

    public static void main(String[] args) {
        System.out.println(product(4));

    }

    static  int product(int  n){

        if(n == 0){
            return 1 ;
        }
   int pro = n * product(n-1);
        return  pro;
    }
}
