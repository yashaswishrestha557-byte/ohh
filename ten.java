import java.util.Scanner;

/**
 * Write a description of class ten here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ten
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String a=scan.next();
        switch(a){
            case"A0":System.out.println("841 x 1189 mm (33.1 x 46.8 inches)");
            case"A1":System.out.println("594 x 841 mm (23.4 x 33.1 inches");
            case"A2":System.out.println("420 x 594 mm (16.5 x 23.4 inches");
            case"A3":System.out.println("297 x 420 mm (11.7 x 16.5 inches");
            case"A4":System.out.println("210 x 297 mm (8.3 11.7 inches ");
            case"A5":System.out.println("148 x 210 mm (5.8 8.3 inches");
        }
        System.out.println(a);
    }
}