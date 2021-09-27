package demo;

public class Main {

    static int print(String message){
        System.out.println(message);
        return message.length();
    }

    public static void main(String[] args) {
        String message = "Hello world !!!";
        int myInteger = 1;
        double myDecimalNumber = 3.14;
        //print
        print(message);
        if (myInteger > myDecimalNumber){
            print("Wooow");
        } else if (myInteger == myDecimalNumber) {
            print("Equal");
        } else {
            print("Booooooo");
        }

        while (myInteger<100){
            print(""+myInteger++);
        }
        for(int count=0; count < 10; count++){
            print(""+count);
        }
    }
}
