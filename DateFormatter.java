import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class DF {
 
    public static void main(String[] args)
    {
        
        LocalDateTime localDate = LocalDateTime.now();
        
        DateTimeFormatter dateformatter
            = DateTimeFormatter.ofPattern("MM dd, YYYY");
    
        System.out.println(dateformatter.format(localDate));
    }
}
