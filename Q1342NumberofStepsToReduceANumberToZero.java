public class Q1342NumberofStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int count =0;
        while(num >0){
            if(num%2 ==0 ){
                count++;
                num /= 2;
            }else{
                count++;
                num -= 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 14;

        System.out.println(numberOfSteps(num));
    }
}
