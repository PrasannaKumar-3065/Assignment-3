package pk;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;

public class App 
{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        int n = 1;
        LOGGER.info("Enter Name: ");
        String name = sc.next();
        LOGGER.log(Level.INFO,"GPA:");
        float gpa = sc.nextFloat();
        STUDENT s = new STUDENT(name,gpa);
        do{
            try{
                LOGGER.log(Level.INFO,"\n1.Display GPA 2.Edit GPA 3.Exit");
                int m = sc.nextInt();
                if(m == 1){
                    s.display();
                }
                else if(m==2){
                    LOGGER.log(Level.INFO,"Enter GPA: ");
                    gpa = sc.nextFloat();
                    s.update(gpa);
                }
                else{
                    n = 0;
                }
            }catch(Exception e){
                String s1 = ""+e;
                LOGGER.info(s1);
                sc.nextLine();
            }
        }while(n==1);
    }
}
