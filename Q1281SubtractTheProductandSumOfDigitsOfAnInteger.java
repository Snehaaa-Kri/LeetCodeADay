public class Q1281SubtractTheProductandSumOfDigitsOfAnInteger {

    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0, lastDigit, updatedNum = n, difference;
        while (updatedNum > 0) {
            lastDigit = updatedNum % 10;
            sum += lastDigit;
            product *= lastDigit;
            updatedNum /= 10;
        }
        difference = product - sum;
        return difference;
    }

    public static void main(String[] args) {
        int n=234;
        // int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
}
