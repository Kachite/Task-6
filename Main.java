import java.util.Scanner;
public class Main {

    public static double fact(int num){
        for (int i = num -1 ; i >= 1; i--){
            num = num * i;
        }
        return num;
    }
    public static void main(String[] args) {
        double sum = 0, x;
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = scanner.nextDouble();
        System.out.print("Enter number: ");
        num = scanner.nextInt();

        for (int i= 0; i <= num; i++){
            sum = sum + Math.pow(x,num) / fact(num);
        }
        System.out.println(sum);
        System.out.println(Math.exp(x));
    }
}