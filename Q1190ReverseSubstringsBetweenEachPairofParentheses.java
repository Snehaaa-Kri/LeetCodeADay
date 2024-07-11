import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q1190ReverseSubstringsBetweenEachPairofParentheses {

    public static String ans(String s){
         Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ')'){
                Queue<Character> q = new ArrayDeque<>();

                while(st.peek() != '('){
                    q.add(st.pop());
                }

                st.pop(); // removing the opening bracket from stack

                //adding back the reverse element
                while(!q.isEmpty()){
                    st.push(q.remove());
                }
            }
            else{
                st.push(ch);
            }
        }

        char[] arr = new char[st.size()];
        int i=arr.length-1;

        while(!st.isEmpty()){
            arr[i] = st.pop();
            i--;
        }

        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";

        System.out.println(ans(s));
    }
}
