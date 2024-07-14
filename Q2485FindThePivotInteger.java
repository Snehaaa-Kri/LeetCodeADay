public class Q2485FindThePivotInteger {
    public static int pivotInteger(int n) {
        //FORMULA APPROACH
        int xsq = (n*n+n)/2;

        double x = Math.sqrt(xsq); // sq root function return double value.
        int y = (int)x;

        if(y*y == xsq){
            return y;
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {
        int n = 8;

        System.out.println(pivotInteger(n));

    }
}
