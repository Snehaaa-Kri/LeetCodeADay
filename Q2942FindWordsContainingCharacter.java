import java.util.List;
import java.util.*;

public class Q2942FindWordsContainingCharacter {

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for (int ch=0 ; ch < words[i].length(); ch++){
                if (words[i].charAt(ch)== x){
                    resultList.add(i);
                    break;
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        String words[] = {"leet","code"};
        char x = 'e';
        // char x = 'a';
        // char x = 'z';


        System.out.println(findWordsContaining(words, x));

    }
}