package pk;
import java.util.logging.*;
import java.util.logging.Logger;

class STUDENT{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    String name;
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
        String s = "Grade is "+gradelevel;
        LOGGER.info(s);
    }
    void update(float gpa){
        this.gpa = gpa;
        grade(gpa);
    }
    void display(){
        String s = name+"'s GPA is "+gpa;
        LOGGER.info(s);
    }
    STUDENT(String name, float gpa){
        this.name = name;
        this.gpa = gpa;
        grade(gpa);
    }
}
