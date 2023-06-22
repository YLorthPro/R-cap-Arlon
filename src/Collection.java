import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Collection {
    public static void main(String[] args) {

        //Les collections

        //Liste

        ArrayList<String> maSuperListe = new ArrayList<>();

        maSuperListe.add("chaine de caractère");
        maSuperListe.add("chaine de caractère 2");
        maSuperListe.add("chaine de caractère 3");

        maSuperListe.set(1,"J'ai changé de String");

        maSuperListe.remove(1);

        maSuperListe.clear();

        //Set

        HashSet<String> monSuperSet = new HashSet<>();

        monSuperSet.add("coucou");

        monSuperSet.add("coucou");

        //Queue

        PriorityQueue<String> maFile= new PriorityQueue<>();

        maFile.add("premier");
        maFile.add("deuxième");
        maFile.add("troisième");

        //Va renvoyer "deuxième" qui est le premier élément de la PriorityQueue. Premier élément car PriorityQueue classe par ordre alphabétique dans ce cas
        System.out.println(maFile.peek());

        //Map

        HashMap<Integer, String> maMap = new HashMap<>();

        maMap.put(85, "Je suis un élément");


        System.out.println("Fin");

        //Wrapper

        int entier = 26;
        Integer wrapper = entier;
        int reEntier = wrapper;

        wrapper=Integer.MIN_VALUE;

        System.out.println(wrapper);






    }
}
