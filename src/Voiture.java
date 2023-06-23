import java.util.Scanner;

public class Voiture {
    String couleur;
    String marque;
    int nbPortes;
    boolean isManuelle;

     Voiture(String couleur, String marque){
        this.couleur = couleur;
        this.marque = marque;
    }

    public Voiture(String marque){
        this.marque=marque;
    }

    public Voiture(int nbPortes){
        this.nbPortes= nbPortes;
    }

    public int avancer(){
         autreMethode();
        System.out.println("Quelle est la distance parcourue?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void autreMethode(){
        System.out.println("Autre méthode");
    }

    public void seDeplacer(int distance){
        System.out.println("je me déplace de: " + distance);
    }

    public void seDeplacer(int distance, boolean marcheArriere){
         if(marcheArriere)
             System.out.println("Je recule de: " + distance);
         else
             System.out.println("je me déplace de: " + distance);
    }
}
