public class Q1486XOROperationInAnArray {

    public static int xorOperation(int n, int start) {
        int xor = 0;
        for(int i=0; i<n; i++){
            xor ^= start+(2*i);
        }

        return xor;
    }

    public static void main(String[] args) {
        int  n = 5, start = 0;

        System.out.println(xorOperation(n, start));
    }
}