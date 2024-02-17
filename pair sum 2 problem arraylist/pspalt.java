import java.util.*;
public class pspalt
{
    // function to find pair exist in array whose sum is equal to target
    public static boolean pairSum2(ArrayList<Integer> list, int tar, int l, int r)
    {
        // to find the pivot point
        for ( int i = 0; i<list.size() ; i++ )
            {
                if(list.get(i)>list.get(i+1))
                {
                    //r= index on which largest number in array present
                    //l= index on which smallest number is array present
                    r=i;
                    l=i+1;
                    break;
                }
            }
            //to find pair 
            while (l != r)
            {
                if(list.get(l)+list.get(r)<tar)
                {
                    //change of l as per the array is sorted and rotated
                    l=(l+1)%list.size();
                }
                else if(list.get(l)+list.get(r)>tar)
                {
                    // change of r as per the array is sorted and rotated
                    r = (list.size()+r-1)%list.size();
                }
                else
                {
                    // pair found
                    return true;
                }    
            }
            //pair not found
        return false;
    }
     public static void main (String args[])
         {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(7);
            list.add(9);
            list.add(10);
            System.out.println(pairSum2(list, 16, 0, 0));
            
         }
}