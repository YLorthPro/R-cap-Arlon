public class DemoObjet {
    public static void main(String[] args) {

        Voiture laVoitureDeSamuel = new Voiture();

        laVoitureDeSamuel.couleur="grise";
        laVoitureDeSamuel.marque="Peugeot";
        laVoitureDeSamuel.nbPortes=5;
        laVoitureDeSamuel.isManuelle=true;

        Voiture laVoitureDeYann = new Voiture();

        laVoitureDeYann.couleur="blanche";
        laVoitureDeYann.marque="Peugeot";
        laVoitureDeYann.nbPortes=2;
        laVoitureDeYann.isManuelle=true;

        System.out.println("La voiture de Samuel est une "+ laVoitureDeSamuel.marque + " et elle a " + laVoitureDeSamuel.nbPortes + " portes.");
    }
}
