import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int luaChon = -1;
        Scanner input = new Scanner(System.in);
        String chuoi = " ";
        while (luaChon != 0) {
            System.out.println("Menu");
            System.out.println("1. In ra hinh chu nhat");
            System.out.println("2. In ra hinh tam giac vuong can");
            System.out.println("3. In ra hinh tam giac can");
            System.out.println("0. Exit");
            luaChon = input.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("moi nhap chieu dai:");
                    int chieuDai = input.nextInt();
                    System.out.println("moi nhap chieu rong:");
                    int chieuRong = input.nextInt();
                    for (int i = 0; i < chieuDai; i++) {
                        System.out.print("*");
                        for (int j = 0; j < chieuRong; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. Chon kieu top-left");
                    System.out.println("2. Chon kieu top-right");
                    System.out.println("3. Chon kieu botton-left");
                    System.out.println("4. Chon kieu botton-right");
                    System.out.println("0. Exit");
                    int kieu = input.nextInt();
                    if (kieu == 0) {
                        System.exit(0);
                    } else if (kieu == 1) {
                        System.out.println("moi nhap chieu dai:");
                        int doLon = input.nextInt();
                        for (int i = 1; i <= doLon; i++) {
                            System.out.print("*");
                            for (int j = 1; j <= doLon - i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else if (kieu == 2) {
                        System.out.println("moi nhap chieu dai:");
                        int doLon = input.nextInt();
                        int sao = doLon;
                        while (sao >= 0) {
                            for (int i = 0; i < doLon - sao; i++) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j < sao; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            sao--;
                        }
                    } else if (kieu == 3) {
                        System.out.println("moi nhap chieu dai:");
                        int doLon = input.nextInt();
                        for (int i = doLon; i > 0; i--) {
                            System.out.print("*");
                            for (int j = 1; j <= doLon - i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else if (kieu == 4) {
                        System.out.println("moi nhap chieu dai:");
                        int doLon = input.nextInt();
                        int sao = 0;
                        while (sao <= doLon) {
                            for (int i = 0; i < doLon - sao; i++) {
                                System.out.print(" ");
                            }
                            for (int j = 0; j < sao; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            sao++;
                        }
                    }

                case 0:
                    System.exit(0);
            }
        }

    }
}
