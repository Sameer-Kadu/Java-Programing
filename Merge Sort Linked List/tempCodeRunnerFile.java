import java.util.*;

public class msll {

    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Function to print the linked list
    public  void printList() 
    {
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        return;
    }
    public Node findMid()
    {
        
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println();
        return slow;
    }
    public Node merge(Node a, Node b)
    {
        Node newer =  new Node(-1);
        Node temp = newer;
        while (a != null && b != null) {
            if(a.data <= b.data)
            {
                temp.next = a;
                a = a.next;
                temp = temp.next;
            }
            else
            {
                temp.next = b;
                b = b.next;
                temp = temp.next;
            }
        }
        if(a != null) {
            temp.next = a;
           // a = a.next;
           // temp = temp.next;
        }
        if (b != null) {
            temp.next = b;
           // b = b.next;
           // temp = temp.next;
        }
        return newer.next;
    }
    public Node mergeSort(Node head)
    {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        //find mid of ll
        Node mid = findMid();

        // separate first and second half of ll
        Node rh =mid.next;
        mid.next = null;
       // Node lh = head;
       Node newlh =  mergeSort(head);
        Node newrh =   mergeSort(rh);
       

        //merge of first adn second half of ll
        return merge(newlh, newrh);  
    }
    public static void main( String[] args)
    {
        msll  llist = new msll();
        llist.addFirst(1);
        llist.addFirst(2);
        llist.addFirst(3);
        llist.addFirst(4);
        llist.addFirst(5);
        llist.addFirst(6);
        llist.printList();
        System.out.println(llist.findMid().data);
        llist.head = llist.mergeSort(llist.head);
        llist.printList();
    }
}