public class recursion {
    public static void main(String[] args) {
        printno(5);


    }

   static void printno(int n){
        if (n==0){
            return ;
        }
        printno(n-1);
        System.out.println(n);

   }
}
