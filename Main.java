import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num1 = stdin.nextInt();
        int num2 = stdin.nextInt();

        YEB_Calculator yc = new YEB_Calculator();
        System.out.println(yc.add(num1,num2));
        System.out.println(yc.multiply(num1,num2));
        System.out.println(Calculator.subtract(num2,num1));
    }
}


interface Calculator {
    int add(int a, int b);
    default int multiply(int a, int b) {
        return a*b;
    }
    static int subtract(int a, int b) {
        return a-b;
    }
}

class YEB_Calculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
