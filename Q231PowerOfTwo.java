public class Q231PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n==0 || n<0){
            return false;
        }
        while(n>=0){
            if(n == 1){
                return true;
            }
            if(n%2 != 0){
                return false;
            }
            n /= 2;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 1;
        // int n = 16;
        // int n = 3;

        System.out.println(isPowerOfTwo(n));
    }
}
