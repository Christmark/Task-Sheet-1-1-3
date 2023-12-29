/*   Writing Control flow statements using Loops
                       tasksheet-1-1-3
 */
 
 
public class Tasksheet_1_1_3{
    public static void main(String[] args) {
        // Our inputs
        int check_number = 10;
        String message;
        
        //conditions /process
        for (int i = 1; i <= check_number; i++) {
            
            message = (i % 2 == 0) ? i+ " is Even number" : i + " is Odd Number";
           
          // Output 
            System.out.println(message);
        }
    }
}
