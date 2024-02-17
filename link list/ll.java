import java.util.*;
public class ll {

    public static class Innerll {
    
        int data;
        Innerll next;
        public Innerll (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Innerll head;
    public static Innerll tail;
    public void addFirst(int data){
        Innerll newData = new Innerll(data);
        newData.next = head;
        head = newData;
    }
    public void addLast(int data)
    {
        Innerll newData = new Innerll(data);
        tail.next = newData;
        tail = newData;
    }
    public static void main(String[] args) {
        ll linklist = new ll();
        linklist.addFirst(2);
        linklist.addFirst(1);

    }
}