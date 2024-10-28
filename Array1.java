import java.util.*;
public class Array1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len=sc.nextInt();
        int array_new[]=new int[len];
        System.out.println("Enter the elements of the array");
        for (int i=0; i<array_new.length; i++){
            System.out.println("Enter the element at index number " + i);
            array_new[i]=sc.nextInt();
        }
        System.out.println("Array is filled!!!");
        sc.nextLine();
        System.out.println("\nDo you want see the elements of the array? yes/no");
        String answer=sc.nextLine();
        if (answer.equals("yes")){
            for (int i=0; i<array_new.length; i++){
            System.out.println("Enter the element at index number " + i + " is " +array_new[i]);
        }
        }
        else if (answer.equals("no")){
            System.out.println("No worries");
        }
        else{
            System.out.println("Wrong choice");
        }
        sc.close();
    }
}
