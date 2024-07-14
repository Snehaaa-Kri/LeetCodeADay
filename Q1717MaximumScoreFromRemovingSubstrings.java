import java.util.ArrayList;

public class Q1717MaximumScoreFromRemovingSubstrings {
    static ArrayList<Character> list = new ArrayList<>();

    // ba checker
    public static int baGain(ArrayList<Character> list, int y){
        int totalBaGain = 0;
        for(int i=0; i <list.size()-1; i++){
            char ch = list.get(i);
            char nextCh = list.get(i+1);

            if(nextCh == 'a' && ch == 'b'){
                totalBaGain += y;
                list.remove(i);
                list.remove(i+1);
                System.out.println("LIST"+list);
            }
        }

        return totalBaGain;
    }
    // ab checker
    public static int abGain(ArrayList<Character> list, int x){
        int totalABGain = 0;
        for(int i=0; i <list.size()-1; i++){
            char ch = list.get(i);
            char nextCh = list.get(i+1);

            if(nextCh == 'b' && ch == 'a'){
                totalABGain += x;
                list.remove(i);
                list.remove(i+1);
            }
        }

        return totalABGain;
    }

    public static int maxGain(String s, int x, int y){
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }

        int gain = 0;

        System.out.println("baGain(list, y)"+baGain(list, y));
        System.out.println("abGain(list, x)"+abGain(list, x));

        if(y>x){
            gain+= (baGain(list, y) + abGain(list, x));
        }
        else{
            gain+= abGain(list, x) + baGain(list, y);
        }

        return gain;
    }
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4, y = 5;

        System.out.println("MAX GAIN ========== "+maxGain(s, x, y));
    }
}
