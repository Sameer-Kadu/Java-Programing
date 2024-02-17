import java.util.*;
public class pspal
{
    public static boolean pairSum(ArrayList<Integer> list, int tar)
    {
        int l=0,  r=list.size()-1;
        for ( int i = 0; i<list.size() ; i++ )
            {
                if (list.get(l)+list.get(r) < tar) {
                    l++;
                }
                else if (list.get(l)+list.get(r) > tar) {
                    r--;
                }
                else
                {
                    return true;
                }
            }
            return false;
    }
     public static void main (String args[])
         {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            System.out.println(pairSum(list, 5));
            
         }
}