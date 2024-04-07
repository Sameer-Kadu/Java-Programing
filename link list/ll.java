import java.util.*;

public class ll {

    public static class Innerll {

        int data;
        Innerll next;

        public Innerll(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Innerll head;
    public static Innerll tail;
    public static int size;

    public void addFirst(int data) {
        Innerll newData = new Innerll(data);
        size++;
        if (head == null) // corner case
        {
            tail = head = newData;
            return;
        }
        newData.next = head;
        head = newData;
    }

    public void addLast(int data) {
        Innerll newData = new Innerll(data);
        size++;
        if (head == null) // corner case 
        {
            tail = head = newData;
            return;
        }
        tail.next = newData;
        tail = newData;
    }

    public void printList() {
        Innerll temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addmiddle(int ix, int data) {
        if (ix == 0) // corner case
        {
            addFirst(data);
            return;
        }
        Innerll current = head;
        int i = 0;
        while (i < ix - 1) {
            current = current.next;
            i++;
        }
        Innerll newNode = new Innerll(data);
        size++;
        newNode.next = current.next;
        current.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) // corner case 
        {
            System.out.println("null");
            return -1;
        }
        if (size == 1) // corner case 
        {
            int v = head.data;
            head = tail = null;
            size--;
            return v;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) // corner case
        {
            System.out.println("null");
            return -1;
        }
        if (size == 1) //corner case
        {
            int v = head.data;
            head = tail = null;
            size--;
            return v;
        }
        Innerll temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;
    }

    public int search(int key) {
        Innerll current = head;
        int i = 0;
        while (current != null) {
            if (current.data == key) {
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;

    }

    public int helper(Innerll head,int key)
    {
        if(head==null)
        {
            return -1;
        }
        else if(head.data ==key )
        {
            return 0;
        }
        int i = helper(head.next, key);
        if (i == -1) {
            return -1;
        }
        return i+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }
    public void reverse()
    {
        Innerll current = tail = head;
        Innerll next;
        Innerll prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
           
        }
        head = prev;
    }
    public void removeMiddle(int x)
    {
        if(x>size)
        {
            System.out.println("greater than size");
            return;
        }
        if(x == 1) // corner case
        {
            head = head.next;
            return ;
        }
        Innerll tem = head;
        int i = 1;
        while (i<x-1) {
            tem = tem.next;
            i++;
        }
        tem.next=tem.next.next;
        return;
    }
    public Innerll middle()
    {
        Innerll slow = head;
        Innerll fast = head;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome()
    {
        //middle
        Innerll mid = middle();
        // reverse  second half
        Innerll current = mid;
        Innerll  next;
        Innerll prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Innerll right = prev;
        Innerll left = head;
        //check if it is palindrome
        if (head == null || head.next == null)//corner case
         {
            return true;
        }
        while (left != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    public static boolean isCycle(){
       Innerll slow = head;
       Innerll fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle()
    {
        Innerll slow = head;
        Innerll fast = head;
         while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
             //Innerll temp = null;
             if(slow==fast)
             {
                 slow = head;
                 while(slow.next!=fast.next)
                 {
                    slow=slow.next;
                    //temp = fast;
                    fast=fast.next;
                 }
                // temp.next = null;
                fast.next = null;
                return;
             }
         }
    }

    public static void main(String[] args) {
         ll linklist = new ll();
    //     linklist.addFirst(3);
    //     linklist.addFirst(2);
    //     linklist.addLast(1);
    //     linklist.addmiddle(2, 2);
    //     linklist.addFirst(1);
    //     // linklist.printList();
    //     // System.out.println(size);
    //     // linklist.removeFirst();
    //     // linklist.printList();
    //     // linklist.removeLast();
    //     // linklist.printList();
    //     // System.out.println(size);
    //     // System.out.println(linklist.recSearch(5));
    //     // System.out.println(linklist.recSearch(10));
    //    // linklist.printList();
    //    // linklist.reverse();
    //   // linklist.removeMiddle(5);
    //     linklist.printList();
    //    System.out.println(linklist.checkPalindrome());
    //     System.out.println(linklist.isCycle());
        head = new Innerll(1);
        Innerll temp = new Innerll(4);
        head.next = temp;
        head.next.next = new Innerll(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        linklist.printList();
        removeCycle();
        linklist.printList();
        System.out.println(isCycle());
        
    }
}