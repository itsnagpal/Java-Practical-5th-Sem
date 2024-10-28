import java.util.*;
public class Conditional1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        if (number%2==0){
            System.out.println(number + " is a even number"); 
        }
        else{
            System.out.println(number + " is a odd number");
        }

    }
}