package demo;

public class FizzBuzz {

    static void fizzBuzz(int fizz, int buzz, int nombreMax){
        for (int monNombre=1; monNombre <= nombreMax; monNombre++){
            if (isMultiple(fizz, monNombre) && isMultiple(buzz, monNombre)){
                System.out.println("FizzBuzz");
            } else if (isMultiple(fizz, monNombre)){
                System.out.println("Fizz");
            } else if (isMultiple(buzz, monNombre)){
                System.out.println("Buzz");
            } else {
                System.out.println(monNombre);
            }
        }
    }

    static boolean isMultiple(int fizz, int monNombre) {
        return monNombre % fizz == 0;
    }

    public static void main(String[] args) {
        fizzBuzz(3, 7,100);
    }
}
