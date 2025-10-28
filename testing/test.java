#Testing java code
  import java.util.Scanner;

public class Number {
    int num; 
    public Number() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
    }

    public void processNumber() {
        if (num > 1000) {
            System.out.println("Please enter a number 1000 or less.");
        } else if (num < 0) {
            System.out.println("Please enter a positive number or zero.");
        } else {
            System.out.println("Counting down from " + num + " to 0:");
            for (int i = num; i >= 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
