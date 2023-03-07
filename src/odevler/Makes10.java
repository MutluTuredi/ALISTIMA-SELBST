package odevler;

public class Makes10 {
    public static void main(String[] args) {
        int a=9,b=5;
        boolean sonuc = true;
        if (a==10 || b==10 || (a+b ==10)){
         sonuc = true;
        }
        else {
            sonuc=false;
        }
        System.out.println("sonuc = " + sonuc);
    }

}
