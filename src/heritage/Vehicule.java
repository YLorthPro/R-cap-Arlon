package heritage;

public class Vehicule {
    private String marque;

    public String getMarque() {
        return marque;
    }

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public void seDeplacer(){
        System.out.println("Je me déplace");
    }
}
