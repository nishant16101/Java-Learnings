
import java.util.Scanner;

public class exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            int a = sc.nextInt();
            System.out.println("Enter the denominator");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("Result"+result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        }
        catch(Exception e){
            System.out.println("Something went wrong"+e.getMessage());
        }
        finally{
            System.out.println("Clean up");
            sc.close();
        }

    }
}