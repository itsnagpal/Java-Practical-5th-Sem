public class Exception_2{
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[6] = 10;
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception caught in the first try-catch block");
            System.out.println("");
        }

        try {
            int result = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught in the second try-catch block");
            System.out.println("");

        }

        try {
            String str = null;
            System.out.println(str.length());
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException caught in the third try-catch block");
            System.out.println("");
        }

        System.out.println("Rest of the code executes after exception handling.");
    }
}
