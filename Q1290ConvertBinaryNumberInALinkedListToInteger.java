import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class Q1290ConvertBinaryNumberInALinkedListToInteger {

    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }


    public static int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int num =0;
        int j =0;
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i) == 1){
                num += Math.pow(2,j);
            }
            j++;
        }
        return num;
    }
    public static void main(String[] args) {
        int[] ll = {1,0,1};
        int head = 1; // node 
    }
}
