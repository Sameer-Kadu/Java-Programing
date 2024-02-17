import java.util.*;
public class bill
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in);
    float pen = sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();
    float g = (18 * (pen+pencil+eraser))/100;
    System.out.println(pen+pencil+eraser+g);
    sc.close();
    }

}