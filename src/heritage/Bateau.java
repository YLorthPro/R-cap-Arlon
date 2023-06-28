package heritage;

public class Bateau extends Vehicule{

    private int nbrDAtterissages;

    public int getNbrDAtterissages() {
        return nbrDAtterissages;
    }

    public void setNbrDAtterissages(int nbrDAtterissages) {
        this.nbrDAtterissages = nbrDAtterissages;
    }

    public Bateau(String marque, int nbrDAtterissages){
        super(marque);
        this.nbrDAtterissages=nbrDAtterissages;
    }
}
