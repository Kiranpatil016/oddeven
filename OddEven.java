public class OddEven{
    public static void main(String[] args) {
        int number = 0;

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the input from the command line arguments
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}