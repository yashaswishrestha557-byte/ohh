import java.util.Scanner;

/**
 * Write a description of class discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discount
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double price=90;
        double discount=0;
        System.out.println("Choose category");
        char v=scan.next().charAt(0);
        if (v=='A'){
            discount=0.60;
        }
        else if(v=='B'){
            discount=0.40;
        }
        else if(v=='C'){
            discount=0.20;
        }
        else if(v=='D'){
            discount=0.10;
        }
        
        double sp=price-(price*discount);
        System.out.println(sp);
        
        
    }
}