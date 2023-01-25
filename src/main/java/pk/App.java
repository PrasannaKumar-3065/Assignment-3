package pk;
import java.util.*;
import java.util.logging.*;
import java.util.function.Supplier;
/*3. Design a class for a student at a school. The class should have the following features:
         - Instance variables for the student's name, grade level, and GPA.
         - A constructor that allows the user to create a student with a given name, grade level, and GPA.
         - A method that allows the user to update the student's GPA.
         - A method that returns the student's name and GPA as a string (e.g. ""John Doe has a 3.5 GPA"")."*/
import java.util.logging.Logger;

class STUDENT{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    static String name;
    char gradelevel;
    float GPA;

    void grade(float GPA){
        if(GPA < 5){
            gradelevel = 'F';
        }
        else if(GPA >5 && GPA < 7){
            gradelevel = 'B';
        }
        else if(GPA > 7){
            gradelevel = 'A';
        }
        LOGGER.info("Grade is "+gradelevel);
    }
    void update(float GPA){
        this.GPA = GPA;
        grade(GPA);
    }
    void display(){
        LOGGER.info(name+"'s GPA is "+GPA);
    }
    STUDENT(String name, float GPA){
        this.name = name;
        this.GPA = GPA;
        grade(GPA);
    }
}
/**
 * Hello world!
 *
 */
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
        float GPA = sc.nextFloat();
        STUDENT s = new STUDENT(name,GPA);
        do{
            LOGGER.log(Level.INFO,"\n1.Display GPA 2.Edit GPA 3.Exit");
            int m = sc.nextInt();
            if(m == 1){
                s.display();
            }
            else if(m==2){
                LOGGER.log(Level.INFO,"Enter GPA: ");
                GPA = sc.nextFloat();
                s.update(GPA);
            }
            else{
                n = 0;
            }
        }while(n==1);
    }
}
