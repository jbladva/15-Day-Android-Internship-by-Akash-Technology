public class factorialRecursive {
    public static void main(String[] args) {
        int num = 6;
        long factorial = fact(num);
        System.out.println("Factorial(Using Recursion) of " + num + " = " + factorial);
    }
    public static long fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}
