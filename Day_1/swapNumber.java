import java.util.Scanner;
public class swapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        float first = sc.nextFloat();
        System.out.println("Enter Second Number");
        float second = sc.nextFloat();

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);


        float temp = first;
        first = second;
        second = temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
