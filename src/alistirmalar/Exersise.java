package alistirmalar;

import java.util.Scanner;

public class Exersise {
    public static void main(String[] args) {
// Soru 1-)
//Bir malın fiyatı 1500ytl dir.Bu mal,%18 i kadar KDVsi alınarak satılacaktır.
// Bu malın KDV sini ve satılacağı fiyatı hesaplayıp ekrana yazdırınız.
            int fiyat = 1500;
            double hesap = (fiyat*18)/100;
            double kdvliFiyat = fiyat + hesap;

            System.out.println(kdvliFiyat);

// Soru 2-)
//Yarıçap Değerini Klavyeden okuyarak
// bir dairenin alanını ve çevresini hesaplayan programı yazınız.

        Scanner pi = new Scanner (System.in);
        System.out.println("Yari capi giriniz");
        double r= pi.nextDouble();


        double pisayi = 3.14;
        double alanHesabi = pisayi*r*r;
        double cevre= 2*r*pisayi;

    }

}
