package demo;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class MonTableau {

    static int[] randomArray(int size, int max){
        int[] result = new int[size];

        for (int index = 0; index < size; index++) {
            result[index] = new Random().nextInt(max);
        }

        return result;
    }

    static int maximum(int[] tableau){
        int max = tableau[0];
        for (int valeur: tableau) {
            if (max < valeur){
                max = valeur;
            }
        }
        return max;
    }

    static int somme(int[] tableau){
        int somme = 0;
        for (int valeur : tableau) {
            somme+=valeur;
        }
        return somme;
    }

    static double moyenne(int[] tableau){
        return ((double)somme(tableau))/tableau.length;
    }

    static double mediane(int[] tableau){
        tableau = tri1(tableau);
        if (tableau.length %2 == 0){
            int indiceMedian = tableau.length / 2;
            return (double)(tableau[indiceMedian] + tableau[indiceMedian-1] )/ 2;
        } else {
            return tableau[tableau.length/2];
        }
    }

    static int[] tri1(int[] tableau){
        boolean isFinish = false; // isFisnish = True
        while (!isFinish){ // while not isFinish:
            isFinish = true; // isFinish = True
            // for indice in range(len(tableau)-1):
            for (int indice = 0; indice < tableau.length -1; indice++) {

                if (tableau[indice] > tableau[indice+1]){
                    isFinish = false;
                    System.out.println("changement "+ tableau[indice] + ">" +tableau[indice+1] + " :" + Arrays.toString(tableau));
                    int temp = tableau[indice];
                    tableau[indice] = tableau[indice+1];
                    tableau[indice+1] = temp;
                }
            }
        }
        return tableau;
    }

    static int[] tri2(int[] tableau){
        int[] result = new int[tableau.length];
        int nextPlace = tableau.length-1;
        for (int iteration = 0; iteration < tableau.length; iteration++) {
            int max = -999_999_999;
            int maxPlace = -1;
            for (int indice = 0; indice < tableau.length; indice++) {
                if (max < tableau[indice]){
                    max = tableau[indice];
                    maxPlace = indice;
                }
            }
            tableau[maxPlace] = -999_999_999;
            result[nextPlace] = max;
            nextPlace--;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] tableau = randomArray(11, 100);
        System.out.println(Arrays.toString(tableau));
        Arrays.sort(tableau);
        System.out.println(mediane(tableau));
        System.out.println(tableau[11111]);
    }
}
