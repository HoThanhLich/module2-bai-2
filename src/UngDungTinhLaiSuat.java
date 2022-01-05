import java.util.Scanner;

public class UngDungTinhLaiSuat {
    public static void main(String[] args) {
        double tienGui = 1.0;
        int soThangGui = 1;
        double laiSuat = 1.0;
        double tongTienLai = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so tien gui: ");
        tienGui = input.nextDouble();

        System.out.println("Nhap so thang gui: ");
        soThangGui = input.nextInt();

        System.out.println("Nhap lai suat: ");
        laiSuat = input.nextDouble();

        for (int i = 0; i < soThangGui; i++) {
            tongTienLai += tienGui * (laiSuat / 100) / 12 * soThangGui;
        }
        System.out.println("Tong so tien lai sau khi gui " + soThangGui + " thang la: " + tongTienLai);
    }
}
