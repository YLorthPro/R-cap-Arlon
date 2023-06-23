public class DemoObjet {
    public static void main(String[] args) {

        Voiture laVoitureDeSamuel = new Voiture("grise","Peugeot");

        laVoitureDeSamuel.nbPortes=5;
        laVoitureDeSamuel.isManuelle=true;

        Voiture laVoitureDeYann = new Voiture("blanche","Peugeot");

        laVoitureDeYann.nbPortes=2;
        laVoitureDeYann.isManuelle=true;

        int distance = laVoitureDeSamuel.avancer();

        laVoitureDeSamuel.seDeplacer(26, true);


        System.out.println("j'ai avancé de: " + distance);

        System.out.println("La voiture de Samuel est une "+ laVoitureDeSamuel.marque + " et elle a " + laVoitureDeSamuel.nbPortes + " portes.");
    }
}
