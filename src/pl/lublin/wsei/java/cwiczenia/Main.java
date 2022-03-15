package pl.lublin.wsei.java.cwiczenia;
//jak w przeglądarce projektu, definicja klasy public class Main



import java.util.Random;




public class Main {

    public static void main(String[] args) {
        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i =0; i <30; i++)
        liczby[i] = rnd.nextInt();
        int mn = Integer.MAX_VALUE;
        long avg = 0;
        int mx = Integer.MIN_VALUE;
        for (int l : liczby)
        {
            System.out.println(1);
            if (l <mn) mn =l;
            if (l> mx) mx =l;
            avg += 1;
        }
System.out.printf("MIN = %d, MAX = %d, AVG =%f", mn,mx, (float)avg/liczby.length);


    }
}