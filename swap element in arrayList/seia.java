import java.util.*;
public class seia
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            int t =0;
            t=list.get(1);
            list.set(1, list.get(3));
            list.set(3, t);
            System.out.println(list);
            
            sc.close();
         }
}