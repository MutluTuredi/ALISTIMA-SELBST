public class DogObject {

    public static void main(String[] args) {

        // ClassName// Object name    new Keyword  // ClasName /Constructor
             Dog          dog      =   new                 Dog();

        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog.ad = "Artis";
        dog.cins = "Kangal";
        dog.renk = "Gri";
        dog.yas = 5;
        dog2.ad = "Max";

        System.out.println("dog.ad = " + dog.ad);
        System.out.println("dog.cins = " + dog.cins);
        System.out.println("dog.renk = " + dog.renk);
        System.out.println("dog.yas = " + dog.yas);
        System.out.println("dog2.ad = " + dog2.ad);
        dog.havla();
        dog.isir();
        dog.uyuuyor();
        dog.yemekye();
        dog2.havla();

    }


}
