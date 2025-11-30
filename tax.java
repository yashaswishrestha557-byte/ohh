import java.util.Scanner;

/**
 * Write a description of class tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tax
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income amount");
        int i=scan.nextInt();
        double tax=0;
        if(i<=500000){
            tax=i*0.01;
        }
        else if(i>=500001 && i>=700000){
            tax=5000+i*0.10;
        }
        else if(i>=700001 && i<=1000000){
            tax=15000+i*0.20;
        }
        else if(i>=1000001 && i<=2000000){
            tax=35000+i*0.30;
        }
        else if(i>=2000001 && i<=5000000){
            tax=335000+i*0.36;
        }
        else{
            tax=1135000+i*0.39;
        }
        System.out.println("Your tax amount is "+tax);
    }
}