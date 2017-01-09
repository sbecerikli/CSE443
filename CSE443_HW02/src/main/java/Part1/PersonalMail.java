package Part1;

/**
 * Created by Seyfullah Becerikli on 02/12/2016.
 */
public class PersonalMail extends EmailAddress{
    private String mail;
    private String name;
    private String surname;
    private String indentetion = "";

    public PersonalMail(String mail, String name, String surname) {
        this.mail = mail;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getIndentetion() {
        return indentetion;
    }

    @Override
    public void setIndentetion(String indentetion) {
        this.indentetion = indentetion;
    }

    @Override
    public String toString() {
        return getMail() + " " + getName() + " " + getSurname() ;
    }

    public void print() {
        System.out.println(getIndentetion() + this.toString());
    }
}
