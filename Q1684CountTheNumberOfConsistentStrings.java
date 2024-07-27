import java.util.HashSet;

public class Q1684CountTheNumberOfConsistentStrings {

    public static boolean reqStr(HashSet<Character> hs, String word){
        for(int i=0 ;i<word.length(); i++){
            if(!hs.contains(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();

        for(int i=0; i<allowed.length(); i++){
            if(!hs.contains(allowed.charAt(i))){
                hs.add(allowed.charAt(i));
            }
        }

        int count =0;

        for(String word : words){
           if(reqStr(hs, word)){
                count++;
           }
        }

        return count;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allowed, words));
    }
}
