package heritage;

public class Train extends Vehicule {
    private int capaciteMax;

    public Train(String marque, int capaciteMax) {
        super(marque);
        this.capaciteMax = capaciteMax;
    }

    @Override
    public void seDeplacer() {
        super.seDeplacer();
        System.out.println("Tchou tchou");
    }
}
