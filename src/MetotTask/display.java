package MetotTask;

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
display();
    }
public static void display(){
    Scanner input=new Scanner(System.in);
    System.out.println("Lutfen Adinizi Girin");
    String name=input.nextLine();
    for (int i =0; i<name.length();i++){
        System.out.print(name.charAt(i)+" ");
        System.out.print(name.charAt(i)+" \s");

    }


}}