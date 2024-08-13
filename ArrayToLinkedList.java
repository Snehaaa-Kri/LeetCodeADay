public class ArrayToLinkedList {

    public static class Node {
        int data;
        Node next;
    

        Node() { data = 0; }
        Node(int d) { this.data = d; }  //constructor to create a new node
    }

    public static Node head;
    
    public static Node insertLast(Node head, int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            return head;
        }
        
        Node ptr = head;
        
        while(ptr.next != null){
            ptr = ptr.next;
        }
        
        
        ptr.next = newNode;
      
        return head;
    }
    static Node constructLL(int arr[]) {
        
        for(int el : arr){
            head = insertLast(head, el);
        }
        
        return head;
    }


    //traversing
    public static void traverse(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"    ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        constructLL(arr);

        traverse(head);
    }
}
