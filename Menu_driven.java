import java.util.*;
public class Menu_driven{
    public static void incrementer(int number){
        while(number>=0){
            System.out.print(number+",");
            if (number%10==0){
                break;
            }
            number+=1;
        }
    }

    public static void factor_count(int number){
        int count=0;
        for(int i=2;i<=((number/2)+1);i++){
            if (number%i==0){
                count+=1;
            }
        }
        System.out.println("The number of factors of "+number+" are "+(count+2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a Menu driven program");
        System.out.println("1. Counting incrementer...");
        System.out.println("2. Counting the factors...\n\n");
        System.out.print("Choose a option : ");
        int option=sc.nextInt();

        

        switch(option){
            case 1:
                System.out.print("Enter the number : ");
                int number1=sc.nextInt();

                incrementer(number1);
                break;
            case 2:
                System.out.print("Enter the number : ");
                int number2=sc.nextInt();

                factor_count(number2);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}