import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String pozdrav = "Ahoj Svet";

        // Toto je pre pisanie textu
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);*/

        /*int prveCislo = 10;
        int druheCislo =5;


        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

        String pozdrav2 = "Ahoj";
        String jmeno = "Honza";

        System.out.println(pozdrav2 + " " + jmeno);*/

        //Uloha: Uzivatel napise sve jmeno a program ho pozdravi
        /*String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve jemno:");
        String jmeno = mujScanner.nextLine();
        System.out.println(pozdrav3 + jmeno);*/

        //Kalkulacka
       /* float prvniCislo;
        float druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        prvniCislo = mujScanner.nextFloat();

        System.out.println("Zadej druhe cislo:");
        druheCislo = mujScanner.nextFloat();


        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);*/

        /*double a = 0.1;
        double b = 0.2;

        double soucet = a + b;
        System.out.println(soucet);*/

        //Uzivatel zada slovo, ve vipisu budu vsechna pismena velke
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo.);*/

        //int prevedeneCislo = Integer.parseInt("5");

        /*int prvniCislo;
        int druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        prvniCislo = mujScanner.nextInt();

        System.out.println("Zadej druhe cislo:");
        druheCislo = mujScanner.nextInt();


        System.out.println(prvniCislo == druheCislo);
        System.out.println(prvniCislo >= druheCislo);
        System.out.println(prvniCislo % druheCislo);

        System.out.println(prvniCislo <= druheCislo);*/

       /*int cisloKPorovnani = 5;

        System.out.println(cisloKPorovnani > 0 && cisloKPorovnani <= 8);
        System.out.println(cisloKPorovnani > 8 || cisloKPorovnani < 0);
        System.out.println(!(cisloKPorovnani > 8 || cisloKPorovnani < 0));*/

        //Feature pre kontrolu veku, ako bude mať užívateľ 18 a viac vypíš do konzoly vitaj v aplikácii
        int vek ;
        Scanner mujScaner = new Scanner(System.in);

        System.out.println("Zadaj vek");
        vek = mujScaner.nextInt();

        if (vek >= 18 && vek < 65) {
            System.out.println("Užívateľ je dospelý");
        }
        else if (vek >= 65) {
            System.out.println("Užívateľ je senior");
        }
        else if (vek >= 0 && vek <18) {
            System.out.println("Užívatel je neplnoletý");
        }
        else {
            System.out.println("Nedá sa zadať záporný vek");
        }






    }
}