package MetotTask;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {


        System.out.println(firstlastname());
    }
public static int firstlastname(){
    Scanner sc=new Scanner(System.in);

        System.out.println("Bitt eingeben  Ihre Vorname");
        String isim=sc.nextLine();
    System.out.println("Bitte  eingeben Ihre Nachname");
        String isim2= sc.nextLine();
    int num =(isim.trim().length()+ isim2.trim().length());
    return num;
}
}
