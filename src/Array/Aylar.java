package Array;

import java.util.Scanner;

public class Aylar {
    public static void main(String[] args) {
        // Yilin Aylari ni gosteren bir array olusturun
        // kullanicidan aldiginiz dogdugu ayi bir sekilde bastrin.sayi girilecek
        System.out.println("Lutfen dogdugunuz ayi sayi olarak giriniz");
        Scanner sc=new Scanner(System.in);
        int dogum= sc.nextInt();
        String [] Aylar;
        Aylar=new String[12];
        Aylar [0]="Ocak";
        Aylar [1]="Subat";
        Aylar [2]="Mart";
        Aylar [3]="Nisan";
        Aylar [4]="Mayis";
        Aylar [5]="Haziran";
        Aylar [6]="Temmuz";
        Aylar [7]="Agustos";
        Aylar [8]="Eylul";
        Aylar [9]="Ekim";
        Aylar [10]="Kasim";
        Aylar [11]="Aralik";

        System.out.println("Kullanicinin Dogdugu Ay: "+ Aylar[dogum-1]);
    }
}
