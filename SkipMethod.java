import java.util.*;
import java.util.regex.Pattern;
  
public class GFG1 {
    public static void main(String[] argv)
        throws Exception
    {
  
        String s = "hi how are you - "
                   + "hello how r u";
  
        System.out.println(s);
  
        // create a new scanner with
        // the specified String Object
        Scanner scanner = new Scanner(s);
  
        // skip the word that
        // matches with the pattern ..eks
        System.out.println("Skipping 5 letter words"
                           + " that ends with 'eks'\n");
  
        scanner.skip(Pattern.compile("..eks"));
  
       
        System.out.println(scanner.nextLine());
  
   
        scanner.close();
    }
}
