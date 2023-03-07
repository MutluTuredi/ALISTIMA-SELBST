public class Cake {
    String baker;
    int slices=5;
    boolean isChoclate;
   static int cakesSlice=20;

   public void eat(){
       slices--;
       System.out.println(baker+ "'s cake slice :"+ slices);
       cakesSlice--;
       System.out.println("CakeSlices: "+ cakesSlice);
   }


}
