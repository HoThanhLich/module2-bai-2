import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static void main(String[] args) {
        int luaChon = -1;
        Scanner input = new Scanner(System.in);
        while (luaChon != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve hinh tam giac");
            System.out.println("2. Ve hinh chu nhat");
            System.out.println("3. Ve hinh vuong");
            System.out.println("0. Exit");
            luaChon = input.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println(" Hinh tam giac !");
                    System.out.println("*******");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println(" Hinh chu nhat !");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    System.out.println("* * * * * * * * *");
                    break;
                case 3:
                    System.out.println(" Hinh vuong !");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * *  ");
                    System.out.println("* * * * * ");
                    System.out.println("* * * * * ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chua chon dung");

            }
        }
    }
}
