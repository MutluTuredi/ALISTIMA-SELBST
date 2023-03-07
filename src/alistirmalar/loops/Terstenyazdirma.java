package alistirmalar.loops;

public class Terstenyazdirma {
    public static void main(String[] args) {
        int numara = 123456;
        int son =0;
        son =numara %10;
        numara=numara/10;
        son= son*10+(numara%10);

        System.out.println("son = " + son);
        System.out.println("numara = " + numara);
    }
}
