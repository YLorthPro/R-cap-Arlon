package heritage;

public class Avion extends Vehicule{
    private int nbrMoteurs;

    public int getNbrMoteurs() {
        return nbrMoteurs;
    }

    public Avion(int nbrMoteurs, String marque){
        super(marque);
        this.nbrMoteurs=nbrMoteurs;
    }

    public void atterir(Bateau b){
        System.out.println("Je suis un avion de la marque "+getMarque()+" et j'atteris sur un bateau de marque " + b.getMarque());
        b.setNbrDAtterissages(b.getNbrDAtterissages()-1);
        System.out.println("Atterissages restants: "+b.getNbrDAtterissages());
    }

    public void direSaMarque(){
        System.out.println("Ma marque est: "+getMarque());
    }


}
