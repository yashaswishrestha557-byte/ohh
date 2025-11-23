import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please input your distance(km)");
        double km=scan.nextDouble();
        System.out.println("please input your travel time(minutes)");
        double time=scan.nextDouble();
        double basefare=30;
        double perkm=20;
        double permin=1.5;
        double cost=basefare+(km*perkm)+(permin*time);
        System.out.println("Innital cost is "+cost);
        System.out.println("Are you local(true or false)");
        boolean local=scan.nextBoolean();
        double a=(local=true)?cost-cost*0.10 : cost;
        
        System.out.println("It is at night(true or false)");
        boolean night=scan.nextBoolean();
        double finalcost=(night=true)? a-a*10 : a;
        System.out.println("Final cost is "+finalcost);
        
        
    }
}
