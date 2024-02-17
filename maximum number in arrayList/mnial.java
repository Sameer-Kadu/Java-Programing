import java.util.*;
public class mnial
{
     public static void main (String args[])
         {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            int c = Integer.MIN_VALUE;
            for ( int i = 0; i<list.size() ; i++ )
                {
                    if(c<list.get(i))
                    {
                        c = list.get(i);
                    }
                }
                System.out.println(c);
                
         }
}