import java.util.Scanner;
// задание на вычисление треугольного числа
public class somePlusJava {
    public static int inputNum() {
        Scanner iScanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите целое число: ");
            while (!iScanner.hasNextInt()) {
                System.out.println("Это не число!");
                iScanner.next();
            }
            num = iScanner.nextInt();
        } while (num <= 0);
        iScanner.close();
        return num;
    }
}
