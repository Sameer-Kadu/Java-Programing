import java.util.*;
public class tax
{
    public static void main(String[] args)
    {
        float t;
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      if ( i <= 500000)
      {
         t=0;
      }
      else if (i > 500000 && i < 1000000) 
      {
         t = (20 * i)/100;
      } 
      else 
      {
         t = (30 * i)/100;
      }  
      System.out.println(t);
      sc.close();
    }
}