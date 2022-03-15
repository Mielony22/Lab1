package pl.lublin.wsei.java.cwiczenia;
//jak w przeglądarce projektu, definicja klasy public class Main


import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "Piotr Gołabek";
        System.out.println(acc.getName());

    }
}