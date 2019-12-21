/**
 *
 * @author mcelejewski
 */
package palindrom;
import java.util.Scanner;


public class Palindrom 
{

   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String a = sc.nextLine();
        int h = a.length();
        
        int p = 0;
        int pp = ( h-1);
        
        for (int i=0; i<h; i++)
        {
            if (a.charAt(i) != a.charAt(pp))
            {
                p = 1;
                break;
            }
            pp --;
        }
        
        if (p == 1)
            System.out.println("To nie jest palindrom");
        else{
            System.out.println("To jest palindrom");
        }
    }
    
}
