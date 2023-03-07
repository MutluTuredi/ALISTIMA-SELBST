package bytshrtintlng;

public class Type_Casting {
    public static void main(String[] args) {

        //  kucuk datadan buyuk dataya cevirme
        int myInt = 9;
        double myDouble = myInt;
        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        double d2 = i;
        System.out.println("d2 = " + d2);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);

        // buyuk datadan kucuk dataya cevirme
        double db=8.8;
    int in = (int) db;
    int p =90;
    short s =(short)p;
    short h =(short)db;

    char ch= 'c';
    int num= 65;
    ch  = (char) num;
    int num3 = ch;
        System.out.println("num3 = " + num3);
        System.out.println("ch = " + ch);
        System.out.println("s = " + s);
        System.out.println("h = " + h);

        System.out.println("in = " + in);


    }

}
