
import java.util.*;


public class QRemoveDuplicates {
    public static String removeDups(String str) {
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        
        for(int i=0; i<str.length(); i++){
            hs.add(str.charAt(i));
        }
        
        StringBuilder newStr = new StringBuilder(hs.size());
        
        Iterator<Character> it = hs.iterator();
        
        
        while(it.hasNext()){
        
            newStr.append(it.next());
        }
        
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str = "zvvo";
        // String str = "snehaaa";

        System.out.println(removeDups(str));
    }
}
