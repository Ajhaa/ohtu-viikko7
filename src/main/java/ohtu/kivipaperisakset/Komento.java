package ohtu.kivipaperisakset;

import java.util.HashMap;

import ohtu.kivipaperisakset.KPSFactory;
import ohtu.kivipaperisakset.KPSPeli;

public class Komento {

    private HashMap<String, KPSPeli> komennot;

    public Komento() {
        komennot = new HashMap<>();
        alustaKomennot();
    }

    public boolean suorita(String komento) {
        if (!komennot.containsKey(komento)) {
            return false;
        }
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        komennot.get(komento).pelaa();
        return true;
    }


    private void alustaKomennot() {
        komennot.put("a", KPSFactory.luoPelaajavsPelaajapeli());
        komennot.put("b", KPSFactory.luoYksinkertainenTekoalypeli());
        komennot.put("c", KPSFactory.luoParannettuTekoalypeli());
    }

}