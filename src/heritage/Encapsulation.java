package heritage;

import java.util.List;

public class Encapsulation {

    //1. Passer en private

    private String variable;
    private int entier;
    private double reel;
    List<String> maListe;

    //2. Déclarer getteurs et setteurs

    public void setVariable(String variable){
        this.variable = variable;
    }

    public String getVariable(){
        return variable;
    }

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) {
        this.entier = entier;
    }

    public double getReel() {
        return reel;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public List<String> getMaListe() {
        return List.copyOf(maListe);
    }

    public void setMaListe(List<String> maListe) {
        this.maListe = maListe;
    }
}
