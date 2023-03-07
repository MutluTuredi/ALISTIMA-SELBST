package odevler;

public class CigaParty {
    public static void main(String[] args) {
        int cigars = 55;
        boolean isweekend = false;
        boolean sonuc = true;
        if ((cigars >= 40 && cigars <= 60 && isweekend != true) || cigars >=40 && isweekend) {
            sonuc = true;
            // System.out.println("true");
      //  } else if (cigars >= 40 && isweekend) {
            // sonuc = true;
            // System.out.println("true");

        } else {
           sonuc = false;
            //System.out.println("false");
        }
        System.out.println("sonuc = " + sonuc);
    }

}