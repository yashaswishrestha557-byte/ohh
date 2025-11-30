import java.util.Scanner;

/**
 * Write a description of class eight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class eight
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double gpa=scan.nextDouble();
        if(gpa==4.0){
            System.out.println("A");
        }
        else if(gpa>=3.0){
            System.out.println("B");
        }
        else if(gpa>=2.5){
            System.out.println("C");
        }
        else if(gpa>=1.5){
            System.out.println("D");
        }
        else if(gpa>+1.0){
            System.out.println("E");
        }
        else{
            System.out.println("Fail");
        }
    }
}