public class Student {
    String name;
    String surname;
    String className;

    static String schoolName; // tek klass uzerinde tek kopyasi olur.

    int age;
    int schoolnumber;
    double weight;

    public void study() {
        System.out.println("Student ist studying...");
    }

    public void code() {
        System.out.println("Student ist Code writing...");
    }

    public void playGame() {
        System.out.println("Student ist Game playing....");
    }


}
