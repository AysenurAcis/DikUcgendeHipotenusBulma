import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,alan;
        double c,cevre;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 1. Kenarı Giriniz : ");
        a=scanner.nextInt();
        System.out.print("Lütfen 2. Kenaru Giriniz : ");
        b=scanner.nextInt();

        alan = a*b;
        c = Math.sqrt((a*a)+(b*b));
        cevre = a*b*c;

        System.out.println("1.Kenar = " + a);
        System.out.println("2.kenar = " + b);
        System.out.println("Hipotenüs = " + c);
        System.out.println("Alan = " +alan);
        System.out.println("Çevresi = " + cevre);
    }
}