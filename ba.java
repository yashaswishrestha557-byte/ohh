import java.util.Scanner;

/**
 * Write a description of class ba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ba
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double price=8000;
        double discount=0;
        char v=scan.next().charAt(0);
        switch(v){
            case'A':discount=60; break;
            case'B':discount=40; break;
            case'C':discount=20; break;
            case'D':discount=10; break;
            default:System.out.println("Invalid");
        }
        double sp=price-(price*discount);
        System.out.println(sp);
    }
}