import java.util.HashMap;

public class Q2325DecodeTheMessage {
    public static String decodeMessage(String key, String message) {

        // hashmap generation using key
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(' ', ' ');

        // char ch = 'a';
        // for(int i=0; i<key.length(); i++){
        //     char currCh = key.charAt(i);
        //     if(!hm.containsKey(currCh)){
        //         hm.put(currCh,ch);
        //         ch++;
        //     }
        //     // else{
        //     //     i++;
        //     // } 
        //     //AUTOMATICALLY HO JAEGA
        // }

        char ch = 'a';
        for(int i=0; i<key.length(); i++){
            
            if(!hm.containsKey(key.charAt(i))){
                hm.put(key.charAt(i),ch);
                ch++;
            }
        }

        for(Character k : hm.keySet()){
            System.out.println(k+ " -> "+ hm.get(k));
        }
        //decoding of message
        String mes = "";
        for(int i=0; i<message.length(); i++){
            if(hm.containsKey(message.charAt(i))){
                mes += hm.get(message.charAt(i));
            }
        }
        return mes;
    }
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        System.out.println(decodeMessage(key, message));
    }
}
