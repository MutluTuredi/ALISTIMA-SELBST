package Array;

public class ArrayYazilimi {
    public static void main(String[] args) {
        // Array deklara etemk
        // 1.Yol
        int []sayilar;
        String [] kelimeler;

        // 2.yol
        int sayilar1 [];
        String kelimeler1 [];


        // Array creatr etmek
        // 1.Yol
        int [] sayilar3;
        sayilar3= new int[5];

        // 2.yol/ ayni stattement icinde olusturma
        int []sayilar4= new int[5];
        // int [5] sayilar5 = nemw int[];   errorverir olmasi gerreken new int [ 5]

   int [] sayilar6=new int[5];
   sayilar6[0]=10; // 1. Element
   sayilar6[1]=5;  // 2. Element
   sayilar6[2]=5;  // 3. Elemet
   sayilar6[3]=5;  // 4. Element
   sayilar6[4]=5;  // 5. Elemet

        //  Array Elementlerin Degerklerine Ulasma.

        System.out.println(sayilar6[0]);
        System.out.println(sayilar6[1]);
        System.out.println(sayilar6[2]);
        System.out.println(sayilar6[3]);
        System.out.println(sayilar6[4]);
    }
}
