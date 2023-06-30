public class findheuniquebit {

    public static void main(String[] args) {

        int n = 4;
        System.out.println(findbit(n,1));

    }

    private static int findbit(int n, int pos) {

        return n & (1<<(pos-1) >> (pos-1));

    }
}
