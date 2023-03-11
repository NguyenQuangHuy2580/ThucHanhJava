import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        int min = a;
        if (b < a) {
            min = b;
        }
        System.out.println("Số nhỏ nhất trong 2 số là: " + min);
    }
}
