package programi;

import java.util.Scanner;

public class Main {

    private static void prikaziOpcije(){
        System.out.println("Dostupne opcije: ");
        System.out.println("izlz - izlazak iz programa");
        System.out.println("mem - prikaz memorijskog zauzeca");
        System.out.println("cena - peikaz cene izvrsavanja");
        System.out.println("svi - prikaz dostupnih programa");
        System.out.println("pomoc - prikaz ovog menija");
    }

    public static void main(String[] args) {

        Platforma p1 = new Platforma("ArchLinux", 8000, 20);
        Platforma p2 = new Platforma("Windows 10", 10000, 30);

        System.out.println("Dostupne platforme: ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("----------------");

        KompliranProgram kp1 = new KompliranProgram("Intellij Idea", 700, p1, 3000000);
        KompliranProgram kp2 = new KompliranProgram("Visual Studio.exe", 400, p2, 5000000);


        System.out.println(kp1);
        System.out.println(kp2);
        System.out.println("----------------");


        SkriptJezik sj1 = SkriptJezik.values()[5];
        SkriptJezik sj2 = SkriptJezik.values()[0];
        Skripta s1 = new Skripta("inicijalizacijaBaze", 0.2, p1, sj1, 1200, 100);
        Skripta s2 = new Skripta("zaustaviWinUpdate" , 5, p2, sj2, 1000, 300);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("----------------");

        Program[] niz = {s1, s2, kp1, kp2};

        Scanner sc = new Scanner(System.in);
        prikaziOpcije();
        String op = sc.next();
        Opcija opcija = Opcija.stringUOpciju(op);

        while (opcija != Opcija.IZLAZ_IZ_PROGRAMA) {
            if(opcija == Opcija.PRIKAZ_DOSTUPNIH_PROGRAMA){
                for(int i = 0; i < niz.length; i++)
                    System.out.println("- " + niz[i]);
            }
            else if(opcija == Opcija.PRIKAZ_ZAUZETE_MEMORIJE){
                for(int i = 0; i < niz.length; i++){
                    System.out.println("- " +
                            niz[i].memorijskoZauzece() + "MB");
                }
            }
            else if(opcija == Opcija.PRIKAZ_CENE_IZVRSAVANJA){
                for(int i = 0; i < niz.length; i++){
                    System.out.println("- " +
                            niz[i].cenaIzvrsavanja());
                }
            }
            else
                prikaziOpcije();

            opcija = Opcija.stringUOpciju(sc.next());
        }


    }
}
