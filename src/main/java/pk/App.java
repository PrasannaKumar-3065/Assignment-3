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
    float gpa;

    void grade(float gpa){
        if(gpa < 5){
            gradelevel = 'F';
        }
        else if(gpa >5 && gpa < 7){
            gradelevel = 'B';
        }
        else if(gpa > 7){
            gradelevel = 'A';
        }
        LOGGER.info("Grade is "+gradelevel);
    }
    void update(float gpa){
        this.gpa = gpa;
        grade(gpa);
    }
    void display(){
        LOGGER.info(name+"'s GPA is "+gpa);
    }
    STUDENT(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
        grade(gpa);
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
        float gpa = sc.nextFloat();
        STUDENT s = new STUDENT(name,gpa);
        do{
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
        }while(n==1);
    }
}
