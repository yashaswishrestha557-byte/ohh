import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age group(Child, Adult, Senior)");
        String age=scan.next();
        System.out.println("Enter movie language");
        String lang=scan.next();
        System.out.println("Are you a student(true/false)");
        boolean student=scan.nextBoolean();
        System.out.println("It is festival season(true/false)");
        boolean f=scan.nextBoolean();
        double iprice;
        double sdis;
        double fdis;
        double lp;
        double finalprice;
        
        if (age=="child"){
            iprice=150;
        }
        else if(age=="adult"){
            iprice=250;
        }
        else{
            iprice=200;
        }
        
        if (lang=="hindi"){
            lp=50;
        }
        else if(lang=="english"){
            lp=100;
        }
        else{
            lp=0;
        }
        
        
        double p=iprice+lp;
        System.out.println(p);
        
        if(student==true){
            sdis=p*0.20;
        }
        else{
            sdis=0;
        }
                
        if(f==true){
            fdis=p*0.15;
        }
        else{
            fdis=0;
        }
        
        finalprice=p-sdis-fdis;
        System.out.println("Your final movie ticket price is "+finalprice);
    }
}