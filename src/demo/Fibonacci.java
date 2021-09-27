package demo;

public class Fibonacci {
    static int fibonacci1(int iteration, int valeur1, int valeur2){
        for (int count = 0; count < iteration; count++){
            int temp = valeur1;
            valeur1 = valeur2;
            valeur2 += temp;
        }
        return valeur1;
    }

    static int fibonacci2(int iteration, int valeur1, int valeur2){
        // Cond ? true : false
        return iteration!=0?fibonacci2(iteration-1, valeur2, valeur2+valeur1): valeur1;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci2(5, 1, 1));
    }
}
