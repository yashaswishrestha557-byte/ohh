import java.util.Scanner;

/**
 * Write a description of class gardechecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gardechecker
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your grade");
        int grade= scan.nextInt();
        if (grade>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}