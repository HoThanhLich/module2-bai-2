import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        int ucln = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = input.nextInt();
        System.out.println("Nhap so b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("Khong co UCLN");
        } else if (a == 0 || b == 0) {
            if (a > b) {
                System.out.println("UCLN la: " + a);
            } else {
                System.out.println("UCLN la: " + b);
            }
        } else {
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    ucln = i;
                }
            }
            System.out.println("UCLN la: " + ucln);
        }
    }
}
