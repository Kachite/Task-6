import java.util.Scanner;

public class Main {

    public static double fact(int num) {
        if(num == 0){
            return 1;
        }
        for (int i = num - 1; i >= 1; i--) {
            num = num * i;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0, x;
        int num;

        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter number: ");
        num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            sum = sum + Math.pow(x, i) / fact(i);
        }
        System.out.println(sum);
        System.out.println(Math.exp(x));
    }
}