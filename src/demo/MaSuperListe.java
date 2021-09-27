package demo;

import java.util.ArrayList;
import java.util.List;

public class MaSuperListe {
    public static void main(String[] args) {
        List<String> maListe = new ArrayList<>();
        maListe.add("Hello");
        maListe.add("World");
        System.out.println(maListe.get(0));
        maListe.set(1, "!!!");
        System.out.println(maListe);
    }
}
