package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.Tekoaly;
import java.util.Scanner;

public abstract class KPSPeli {
    protected Tuomari tuomari;
    protected Scanner scanner;

    public KPSPeli(Tuomari tuomari, Scanner scanner) {
        this.tuomari = tuomari;
        this.scanner = scanner;
    }

    public abstract void pelaa();
}