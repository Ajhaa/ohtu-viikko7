package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSFactory {
    
    public static KPSPeli luoYksinkertainenTekoalypeli() {
        Tekoaly tekoaly = new TekoalySimppeli();
        Tuomari tuomari = new Tuomari();
        Scanner scanner = new Scanner(System.in);

        return new KPSTekoaly(tuomari, scanner, tekoaly);
    }

    public static KPSPeli luoParannettuTekoalypeli() {
        Tekoaly tekoaly = new TekoalyParannettu(20);
        Tuomari tuomari = new Tuomari();
        Scanner scanner = new Scanner(System.in);

        return new KPSTekoaly(tuomari, scanner, tekoaly);
    }

    public static KPSPeli luoPelaajavsPelaajapeli() {
        Tuomari tuomari = new Tuomari();
        Scanner scanner = new Scanner(System.in);

        return new KPSPelaajaVsPelaaja(tuomari, scanner);
    }

}