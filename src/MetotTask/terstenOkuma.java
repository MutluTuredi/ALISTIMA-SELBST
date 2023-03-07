package MetotTask;

public class terstenOkuma {
    public static void main(String[] args) {

        System.out.println(terstenOku("Mutlu"));

    }
public static String terstenOku(String name){
         String ters ="";
       for(int i=name.length()-1; i>=0; i--) {
           ters = ters +name.charAt(i);

       }

        return ters;

}
}
