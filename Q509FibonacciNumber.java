public class Q509FibonacciNumber {
    public static int  fib(int n) {
        //N -SMALL : STORE THE FIBO NUMBERS IN ARRAY AND RETURN Nth ELEMENT -- more optimized!!!!!!!
        // 1 1 2 3 5

        
        if(n == 0 ){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            int[] arr = new int[n];

            arr[0] = 1;
            arr[1] = 1;

            for(int i=2; i<arr.length; i++){
                arr[i] = arr[i-1]+ arr[i-2];
            }

            return arr[n-1];
        }
 

        //RECURSION 
            // if(n == 1 || n == 0){
            //     return n;
            // }

            // return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 2;

        System.out.println(fib(n));
    }
}
