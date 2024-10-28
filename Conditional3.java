import java.util.*;
public class Conditional3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first=sc.nextInt();
        System.out.print("Enter the second number : ");
        int second=sc.nextInt();
        System.out.print("Enter the third number : ");
        int third=sc.nextInt();
        if (first>second){
            if (first>third){
                System.out.println(first+" is the greatest number");
            }
            else{
                System.out.println(third+" is the greatest number");
            }
        }

        else if (first>third){
            if (first>second){
                System.out.println(first+" is the greatest number");
            }
            else{
                System.out.println(second+" is the greatest number");
            }
        
        }
        else{
            if (third>second){
                System.out.println(third+" is the greatest number");
            }
            else{
                System.out.println(second+" is the greatest number");
            }
        }
        

    }
}