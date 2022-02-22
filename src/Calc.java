import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("firstNum = " + firstNum);
        System.out.println(firstNum);

        System.out.println("Enter the second number: ");
        double secondNum = sc.nextDouble();
        System.out.println("second num = " + secondNum);
    }
}
