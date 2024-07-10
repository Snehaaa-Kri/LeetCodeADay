import java.util.HashMap;

public class Q13RomanToNumeral {
    public static int getNum(String s){
        HashMap<Character, Integer> hs = new HashMap<>();

        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('c', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        int num = 0;
        for(int i=0; i<s.length(); i++){ 
            num += hs.get(s.charAt(i));
        }
        return num;
    }

    public static void main(String[] args) {
        // String str = "LVIII";
        // String str = "III";
        String str = "MCMXCIV";

        System.out.println(getNum(str));
    }
}