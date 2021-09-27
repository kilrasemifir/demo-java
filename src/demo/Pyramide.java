package demo;

public class Pyramide {

    static void pyramide(int taille){
        String etage = "";
        for (int nEtage = 0; nEtage < taille; nEtage++){
            etage += '*';
            System.out.println(etage);
        }
        for (int nEtage = taille -1; nEtage >0; nEtage--){
            System.out.println("*".repeat(nEtage));
        }
    }

    public static void main(String[] args) {
        pyramide(5);
        /*
        *
        **
        ***
        **
        *
         */
    }
}
