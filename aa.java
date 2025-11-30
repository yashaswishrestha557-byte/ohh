import java.util.Scanner;

/**
 * Write a description of class aa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class aa
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        if (num%5==0){
            if (num%3==0){
                System.out.println("Divisible by 5 and 3");
            }
            else{
                System.out.println("Divisible by 5");
            }
        }
        else if(num%3==0){
            System.out.println("divisible by 3");  
        }
        else{
            System.out.println("not divisible by both");
        }
    }
}