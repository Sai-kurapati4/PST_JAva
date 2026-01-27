import java.util.Scanner;

public class task7 {

    public int EvenOddDigitsSum(int input1, String input2) {
        int digitsum = 0;

        while (input1 > 0) {
            int k = input1 % 10;

            if (input2.equalsIgnoreCase("even") && k % 2 == 0) {
                digitsum += k;
            } 
            else if (input2.equalsIgnoreCase("odd") && k % 2 != 0) {
                digitsum += k;
            }

            input1 /= 10;
        }

        return digitsum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter even or odd: ");
        String input2 = sc.next();

        task7 obj = new task7();
        int result = obj.EvenOddDigitsSum(input1, input2);

        System.out.println("Result = " + result);

        sc.close();
    }
}
