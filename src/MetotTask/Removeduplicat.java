package MetotTask;

public class Removeduplicat {
    public static void main(String[] args) {
        System.out.println(cumle("DDEECGDDEEEEFGGDCDDK"));

    }
 public static String cumle(String str){

  String tekHarfler="";
  for (int i =0; i<str.length();i++){
      if (!tekHarfler.contains(""+str.charAt(i))){
          tekHarfler+=str.charAt(i);
      }
  }
return tekHarfler;
   }
 }



