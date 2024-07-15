import java.util.HashMap;
import java.util.HashSet;

public class Q2196CreateBinaryTreeFromDescriptions {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}

        // TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
        TreeNode(int val) {
          this.val = val;
          this.left = null;
          this.right = null;
      }
    }

    public static TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>(); //for storing parent nodes
        HashSet<Integer> set = new HashSet<>();  //for storing the values of child- baad me parent value find out krne ke liye.

        for(int i=0; i<descriptions.length; i++){
            int par = descriptions[i][0];

            //parent insertion
            if(!map.containsKey(par)){
                map.put(par, new TreeNode(par));
            }

            //child node nhi present h to usse insert kr diya 
            int child = descriptions[i][1];
            if(!map.containsKey(child)){
                map.put(child, new TreeNode(child));
            }


            if(descriptions[i][2] == 1){ //left child h 
               map.get(par).left = map.get(child);
            }
            else{
               map.get(par).right = map.get(child);
            }
            set.add(child);
        }


        //root node determing
        for(int[] desc : descriptions){
            if(!set.contains(desc[0])){
                return map.get(desc[0]);
            }
        }
        return null;
    }


    // public static void inorder(TreeNode root){
    //     if(root == null){
    //         return;
    //     }

    //     //LNR
    //     inorder(root.left);
    //     System.out.print(root.val+ "    ");
    //     inorder(root.right);
    // }
    public static void main(String[] args) {
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};

        TreeNode root = createBinaryTree(descriptions);
        System.out.println(root.val);

        // inorder(root);
    }
}
