package MetotTask;

public class uniqeuChar {
    public static void main(String[] args) {
        System.out.println("uniqeChar(\"AAAAFFJJKOKPIKLLÖÖÖ\") = " + uniqeChar("GGGHHMMTKLDD"));

    }

    public static String uniqeChar(String str) {
String unique ="";
for (int i=0; i <str.length(); i++){
    if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
        unique+=str.substring(i,i+1);

    }
}

        return unique;
    }


}
