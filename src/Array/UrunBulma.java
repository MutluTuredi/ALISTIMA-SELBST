package Array;

import java.util.Scanner;

public class UrunBulma {
    public static void main(String[] args) {
        // Kullanicindan bir Urrun alip, istenilen urunun markette olup olmadigini bildiren bir program yaziniz

        String[] urunler = {"Ekmek", "peynir", "Zeytin", "Recel", "Bal"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Istediginiz Urunu Girinin");
        String talep = sc.next();
        boolean k = true;
        for (int i = 0; i < urunler.length - 1; i++) {
            if (urunler[i] == talep) ;
            {
                k = true;
                System.out.println("Istediginiz urun bulunuyor");
            }
        }


    }
}
