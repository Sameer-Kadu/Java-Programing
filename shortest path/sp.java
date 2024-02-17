import java.util.*;
public class sp     
{
     public static void main (String args[])
         {
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            int x=0,y=0;
            for (int i = 0; i < a.length(); i++)
            {
                if(a.charAt(i) == 'N')
                {
                    y++;
                }
                else if (a.charAt(i) == 'S')
                {
                    y--;
                }
                else if (a.charAt(i) == 'E')
                {
                    x++;
                }
                else if (a.charAt(i) == 'W')
                {
                    x--;
                }
            }
            int x2 = x*x;
            int y2 = y*y;
            float u = (float)Math.sqrt(x2 + y2);
            System.out.println(u);
            

            sc.close();
         }
}