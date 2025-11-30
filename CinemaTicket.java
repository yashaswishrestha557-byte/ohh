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
        System.out.println("Is it hindi movie");
        boolean hlang=scan.nextBoolean();
        System.out.println("Is it a english movie");
        boolean elang=scan.nextBoolean();
        System.out.println("Are you a student(true/false)");
        boolean student=scan.nextBoolean();
        System.out.println("It is festival season(true/false)");
        boolean f=scan.nextBoolean();
        double iprice=0;
        double sdis=0;
        double fdis=0;
        double lp=0;
        double finalprice=0;
        
        if (age=="child"){
            iprice=150;
        }
        else if(age=="adult"){
            iprice=250;
        }
        else{
            iprice=200;
        }
        
        if (hlang==true){
            lp=50;
        }
        if(elang==true){
            lp=100;
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