package odevler;

public class PozNeg {
    public static void main(String[] args) {

        int a = -3, b = -3;
        boolean paramerter = true;
        boolean sonuc = true;
        if (paramerter == true && a < 0 && b < 0) {
            sonuc = true;
        } else if (a < 0 || b < 0) {
            sonuc = true;
        }
        else {
            sonuc = false;
        }
        System.out.println("sonuc = " + sonuc);
    }
}

