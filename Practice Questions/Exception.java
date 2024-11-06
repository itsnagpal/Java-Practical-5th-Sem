
public class Exception {
    public static void main(String[] args) {
        try {
            int a[] = new int[10];
            a[11] = 76 / 1;
            a[10] = 76 / 0;  
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
            System.out.println("");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception: " + "" +e);
            System.out.println("");
        }
        System.out.println("rest of the code");
    }
}
