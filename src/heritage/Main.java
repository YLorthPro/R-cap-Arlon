package heritage;

public class Main {
    public static void main(String[] args) {
        Avion avion1 = new Avion(4,"Suedois");
        Avion avion2 = new Avion(2,"Finlandais");

        Bateau bateau1 = new Bateau("Norvege",3);

        avion1.atterir(bateau1);
        avion2.atterir(bateau1);


    }
}
