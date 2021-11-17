import java.util.Scanner;

public class Reverse {

        public static void main(String[] args)
        {
            int reverse = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number :");
            int num = scanner.nextInt();
            for( ;num != 0; num=num/10)
            {
                int remainder = num % 10; //4
                reverse = reverse * 10 + remainder;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
}
