
/**
 * Write a description of class tuotial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tuotial4
{
    public static void main(String[] args){
        int age;
        age=18;
        
        System.out.println("");
        if(age>18){
            System.out.println(age);
        }
        else{
            System.out.println("You are less than 18");
        }
        
        int num=10;
        if(num >=1){
            System.out.println("positive");
        }
        else if (num==0){
            Syste.out.println("0");
        }
        if (num<0){
            System.out.println("negative");
        }
        
        int n=15;
        if (n%3==0){
            if (n%5==0){
                System.out.println("divisible by both");
            }
            else{
                System.out.println("divisible by 3");
            }
        }
        else{
            if (n%5==0){
                System.out.println("divisible by 5");
            }
            else{
                Syste.out.println("neither");
            }
        }
        
        int choice=1;
        switch(choice){
            case 1:System.out.println("a"); break;
            case 2:System.out.println("ab");
        }
}