package gun_12_TekrarReview;

public class LogicalOperatorlers {
    public static void main(String[] args) {
        boolean gunHaftaSonumu;
        boolean gunCumartesimi = false;
        boolean gunPazarmi = false;
        gunHaftaSonumu = gunCumartesimi || gunPazarmi;
        System.out.println("gunHaftaSonumu = " + gunHaftaSonumu);
        boolean gunHaftaicimi = !gunCumartesimi && !gunPazarmi;
        gunHaftaicimi = !gunHaftaSonumu;
        System.out.println("gunHaftaicimi = " + gunHaftaicimi);

        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
        boolean not = true;
        int no =-20;
        boolean pozitifSayi =no>=0;
        System.out.println("numara pozitif sayi mi= " + pozitifSayi);
        boolean negatifSayimi =!pozitifSayi;
        System.out.println(" negatif sayi mi =" + negatifSayimi);

    }
}
