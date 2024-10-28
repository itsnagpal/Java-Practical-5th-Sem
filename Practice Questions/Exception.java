
public class Exception {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[6] = 30 / 1;
            a[5] = 30 / 0;  // This line will throw an ArithmeticException before ArrayIndexOutOfBoundsException
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
