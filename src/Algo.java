public class Algo {
    public static void main(String[] args) {

        // primitifs

        // numerics
        // entiers
        byte machinBidule; //1Byte = -128 -> 127
        short truc; //2 Bytes = -32k et 32k
        int superGrand; //4Byte
        long superMegaGrand; //8Bytes

        machinBidule = 25;

        superGrand = 1_000_000_000;

        superMegaGrand =1_000_000_000L;

        //Réels

        float f = 8.1F; //4 Bytes
        double d =8.1; //8 Bytes

        // autres
        char c = 'c'; //2 Bytes stocké comme un nombre
        boolean b =true;

        //String

        String nomVariable = "coucou";
        String nomVariable2 = "coucou";
        String nomVariable3 = new String("coucou");

        //Comparer l'adresse de String

        System.out.println(nomVariable == nomVariable2); //true
        System.out.println(nomVariable == nomVariable3); //false (adresse différente)

        //Comparer la valeur de String

        System.out.println(nomVariable.equals(nomVariable3));

        //Perf

        for (int i=0; i<10; i++) {
            nomVariable += ("A");
        }

        System.out.println(nomVariable);

        StringBuilder builder = new StringBuilder("coucou");

        builder.append("A");

        System.out.println(builder.toString());

        //constantes

        final int NOMBRE;

        NOMBRE = 25;

        // Cast

        int entier = 120;
        byte entier2 = 127;

        entier2 = (byte) entier;
        System.out.println(entier2);

        //Tableaux

        int[] tableau = new int[5];
        char[] tableau2 = new char[]{'a','@'};

        int[] tableau3;
        tableau3 = new int[] {12,35,26,78,95};

        System.out.println(tableau3[3]);

        tableau3[2]=112;


        // Convention de nommage
        
        // lowerCamelCase - variables, méthodes
        // UpperCamelCase - Classes, Interfaces, Enums
        // lower_snake_case - variables     je_suis_une_variable
        // UPPER_SNAKE_CASE - constantes, valeurs d'Enum
        
        //Utils
        
        // ligne de commentaire
        
        /*
            bloc de commentaire
         */

        //TODO continuer le cours
        
    }
}