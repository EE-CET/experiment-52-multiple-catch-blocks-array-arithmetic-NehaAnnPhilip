import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // TODO: Read N
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            
            // TODO: Create array and read N integers
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                }
            }
            
            // TODO: Read index
            if (!scanner.hasNextInt()) return;
            int index = scanner.nextInt();
            
            // TODO: Read divisor
            if (!scanner.hasNextInt()) return;
            int divisor = scanner.nextInt();
            
            // Perform division of the element at the specified index
            int result = arr[index] / divisor;
            System.out.println(result);
            
        } 
        // TODO: catch ArrayIndexOutOfBoundsException -> Print "Invalid Index"
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } 
        // TODO: catch ArithmeticException -> Print "Divide by zero error"
        catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
        
        scanner.close();
    }
}
