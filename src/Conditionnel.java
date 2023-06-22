import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Conditionnel {
    public static void main(String[] args) {

        Voiture v = new Voiture();

        Voiture laVoitureDeSamuel = new Voiture();

        laVoitureDeSamuel.couleur="grise";
        laVoitureDeSamuel.marque="Peugeot";
        laVoitureDeSamuel.nbPortes=5;
        laVoitureDeSamuel.isManuelle=true;

        //if

        if(laVoitureDeSamuel.marque.equals("Peugeot"))
            System.out.println("La voiture de Samuel est une Peugeot");
        else if(laVoitureDeSamuel.marque.equals("VW"))
            System.out.println("La voiture de Samuel est une Peugeot");
        else
            System.out.println("La voiture de Samuel est une marque inconnue");

        //switch

        switch (laVoitureDeSamuel.couleur){
            case "bleu":
                System.out.println("Elle est bleue");
                break;
            case "grise":
                System.out.println("Elle est grise");
                break;
            default:
                System.out.println("Je ne connais pas sa couleur");
                break;
        }

        //Opérateur ternaire

        boolean laVoitureExiste = laVoitureDeSamuel!=null? true: false;


    }
}
