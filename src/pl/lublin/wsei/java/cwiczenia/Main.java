package pl.lublin.wsei.java.cwiczenia;
//jak w przeglądarce projektu, definicja klasy public class Main


import java.util.Scanner;

public class Main {
    /*- nazwa klasy taka sama jak
nazwa pliku Main.java */

    public static void main(String[] args) {
        System.out.print("Ala");
        System.out.print("Ma");
        System.out.print("Kota\n");
        System.out.print("Ala\n");
        System.out.print("Ma\n");
        System.out.print("Kota\n");
        int a = 3;
        double b = 4.21;
        String s = "Ala ma kolejnego kota";
        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);
        System.out.print("Nazywalismy to \"witamina B3\n");
        System.out.print("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        Scanner input = new Scanner(System.in);
        int num1, num2 ;
        do {
            System.out.print("Podaj pierwsza liczbe");
            num1 = input.nextInt();
            if (num1 == 0) break;
            System.out.print("Podaj druga liczbe");
            num2 = input.nextInt();
            if (num2 == 0) break;
            System.out.printf("Wynik dodawania %d +%d = %d%n", num1, num2, num1 + num2);
        } while (true);


    }
}