import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("첫번쨰 숫자를 넣어주세요: ");
        int num1 = stdin.nextInt();

        System.out.print("두번쨰 숫자를 넣어주세요(첫 번째 숫자보다 커야함): ");
        int num2 = stdin.nextInt();

        YEB_Calculator yc = new YEB_Calculator();
        System.out.println("덧셈: " + yc.add(num1,num2));
        System.out.println("곱셈: " + yc.multiply(num1,num2));
        System.out.println("덧셈: " + Calculator.subtract(num2,num1));
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