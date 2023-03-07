package gun_12_TekrarReview;

public class AsigmentOperators {
    public static void main(String[] args){
        // =   ==
        int a = 10;
        int b = 10+a;  // copliler sagdan sola dogru calisir ilk olarak esitligin sagini complir ediyor.

        System.out.println("a==b="+ (a==b));  // ekranda  a==b = false
        System.out.println(a!=b);             //  Ekranda  true cikacak

        a=a+10;
        a+=a;  // a 'yi a kadar artir.
        System.out.println("a = " + a);

        a=a/4; // a yi 4 e bolduk.
        a/=2; // sonra da iki ye bolduk

        System.out.println("a = " + a);
        a= a*4;
        a*=4;
        System.out.println("a = " + a);



    }
}
