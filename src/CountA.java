import java.util.Scanner;

public class CountA {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the String :");
            String s = scanner.next();
            int TotalCount =s.length();
            int count_afterRemove= s.replace("a","").length();
            int count = TotalCount-count_afterRemove;
            System.out.println("The number of occurrences of a is " + count);

        }
}
