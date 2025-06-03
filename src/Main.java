import java.util.Random;
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
       /* int vek ;
        Scanner mujScaner = new Scanner(System.in);

        System.out.println("Zadaj vek");
        vek = mujScaner.nextInt();

        if (vek >= 18) {
            System.out.println("Užívateľ je dospelý");
            if (vek >= 65) {
                System.out.println("Užívateľ je senior");
            }
        }
        else if (vek >= 0 && vek <18) {
            System.out.println("Užívatel je neplnoletý");
        }
        else {
            System.out.println("Nedá sa zadať záporný vek");
        }*/

        //Vypocet BMI hmotnost(kg)/vyska(m) na druhou, vypis do konzole vysledek
        // (<18.5) - podváha
        // (>=18.5 && <25) - optimální váha
        // (>=25) - nadváha
        /*float vyska;
        float hmotnost;
        float bmi;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vysku(m):");
        vyska = mujScanner.nextFloat();
        System.out.println("Zadej vahu(kg)");
        hmotnost = mujScanner.nextFloat();
        bmi = hmotnost / (vyska * vyska);

        if(bmi < 18.5f && bmi >= 0) {
            System.out.println("Uzivatel ma podvahu");
        }
        else if(bmi>=18.5f && bmi<25){
            System.out.println("Uzivatel ma optimalni vahu");
        }
        else if(bmi>=25) {
            System.out.println("Uzivatel ma nadvahu");
        }
        else {
            System.out.println("Užívateľ zadal zápornú hmotnosť");
        }

        System.out.println(bmi);*/


        //Liche cislo = vyhrava, Sude cislo = prohrava
        /*int hodeneCislo;
        Random nahodnyGenerator = new Random();

        System.out.println("Pre hodenie kockou stlač Enter");
        Scanner mujScaner = new Scanner(System.in);
        mujScaner.nextLine();

        hodeneCislo = nahodnyGenerator.nextInt(1, 7);

        System.out.println("Hodene číslo je: " + hodeneCislo);

        if(hodeneCislo % 2 == 1) {
            System.out.println("licha - Vyhrávaš!");
        }
        else {
            System.out.println("Suda - Prehrávaš!");
        }*/

        //Switch - den v týždni
        Scanner mujScaner = new Scanner(System.in);
        /*int cisloDne;
        System.out.println("Zadaj číslo dňa");
        cisloDne = mujScaner.nextInt();

        switch (cisloDne) {
            case 1:
                System.out.println("je Pondelok");
                break;
            case 2:
                System.out.println("je Utorok");
                break;
            case 3:
                System.out.println("je Streda");
                break;
            case 4:
                System.out.println("je Štvrtok");
                break;
            case 5:
                System.out.println("je Piatok");
                break;
            case 6:
                System.out.println("je Sobota");
                break;
            case 7:
                System.out.println("je Nedeľa");
                break;
            default:
                System.out.println("Neplatné číslo dňa");
        }

        switch (cisloDne) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovný deň");
                break;
            case 6:
            case 7:
                System.out.println("Je víkend");
                break;
        }*/

        //Pole
        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 1;
        znamky[3] = 3;
        znamky[4] = 1;

        int[] znamky2 = new int[] {3, 5, 1, 3, 1};

        System.out.println(znamky[2]);*/

        /*String[] mena = new String[] {"Peter", "Jano", "Nikola", "Jožo", "Kata"};
        mena[0] = "Linda";
        System.out.println(mena);*/

        //Slučky
        for(int i = 0; i < 10; i++) {
            //System.out.println(i * 5);
            if(i == 5){
                //break;
                continue;
            }
            System.out.println(i);
        }



    }
}