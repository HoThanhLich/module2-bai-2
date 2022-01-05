import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n;
        String result = "";
        boolean flag = true;

        System.out.println("Enter a number: ");
        n = scanner.nextShort();

        if (n == 1) {
            result = "Khong phai so nguyen to !!!";
        } else if (n == 2) {
            result = "La mot so nguyen to";
        } else {
            for (short i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result = "La mot so nguyen to";
            } else {
                result = "Khong phai so nguyen to";
            }
        }
        System.out.println(n + " " + result);
    }
}
