package oOP;

public class Autor {
  private   String name;
    private  String eMail;
    private char gender;

    public Autor(String name, String eMail, char gender) {
        this.name = name;
       seteMail(eMail);
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public char getGender() {
        return gender;
    }

    public void seteMail(String eMail) {
        if (!eMail.contains("@")){
            this.eMail="Hatali e Mail girildi";
        }
else {
    this.eMail=eMail;
        }
    }

    @Override
    public String toString() {
        return name+"Autor " + gender+ " at "+eMail;


    }
}
