import java.util.Scanner;

/**
 * Write a description of class nine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nine
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your gpa");
        double gpa=scan.nextDouble();
        System.out.println("enter your attendance");
        int att=scan.nextInt();
        System.out.println("enter attitude score");
        int aud=scan.nextInt();
        if (gpa>=3.2){
            if (att>80){
                if(aud>5){
                    System.out.println("Eligible for scholorhsip");
                }
            }
        }
        else{
            System.out.println("Not eligible");
        }
    }
}