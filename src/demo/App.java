package demo;

public class App {

    static int maSuperFonctionDeLaMort(String monParametreKiTu){
        System.out.println(monParametreKiTu);
        return monParametreKiTu.length();
    }

    // def main(args):
    public static void main(String[] args) {
        String message = "Hello tout le monde";
        int myInteger = 5;
        double myDecimalNumber = 5.6;
        int result = maSuperFonctionDeLaMort(message+myInteger+myDecimalNumber);
        System.out.println(result);

        if (myInteger > 10){
            System.out.println("Bravo");
        } else if (myInteger > 5){
            System.out.println("Boff");
        } else {
            System.out.println("KO");
        }
    }
}
