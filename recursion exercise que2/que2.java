import java.util.*;

public class que2 {
    public static String numberToWord(int a, int i) {
        StringBuilder sb = new StringBuilder("");
        String s = Integer.toString(a);
         if (i == s.length()) {
            
            
            return "";
        }
        char e = s.charAt(i);
       
        
        switch (e) {
            case '0':
                sb.append("Zero ");
                break;
            case '1':
                sb.append("One ");
                break;
            case '2':
                sb.append("Two ");
                break;
            case '3':
                sb.append("Three ");
                break;
            case '4':
                sb.append("Four ");
                break;
            case '5':
                sb.append("Five ");
                break;
            case '6':
                sb.append("Six ");
                break;
            case '7':
                sb.append("Seven ");
                break;
            case '8':
                sb.append("Eight ");
                break;
            case '9':
                sb.append("Nine ");
                break;
        }
      sb.append(numberToWord(a, i+1));
      return sb.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String re = numberToWord(a, 0);
        System.out.print(re);
        

        sc.close();
    }
}
