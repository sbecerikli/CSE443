package Part1;

import java.util.LinkedList;

/**
 * Created by Seyfullah Becerikli on 22/11/2016.
 */

public class main {
    public static void main(String[] args){

        MyAddressBook myAdressBook = new MyAddressBook(new LinkedList<EmailAddress>());

        EmailAddress person1 = new PersonalMail("yasin.tulumen@gmail.com", "Yasin", "Tulumen");
        EmailAddress person2 = new PersonalMail("timucinyayla@gmail.com", "Timucin", "Yayla");
        EmailAddress person3 = new PersonalMail("gyazici@gmail.com", "Gokberk", "Yazici");
        EmailAddress person4 = new PersonalMail("sbecerikli@gmail.com", "Seyfullah", "Becerikli");

        EmailAddress person5 = new PersonalMail("mehmetkucuk@gmail.com", "Mehemt", "Kucuk");
        EmailAddress person6 = new PersonalMail("mesutkilic@gmail.com", "Mesut", "Kilic");
        EmailAddress person7 = new PersonalMail("becerikLee_61@gmail.com", "Seyfullah","Becerikli");
        EmailAddress person8 = new PersonalMail("buraktuzgen@gmail.com", "Burak", "Tuzgen");

        EmailAddress person9 = new PersonalMail("sbecerikli@gtu.edu.tr", "Seyfullah", "Becerikli");
        EmailAddress person10 = new PersonalMail("eaptoula@gtu.edu.tr", "Erchan", "Aptoula");

        EmailAddress university = new GroupMail("gtu@gtu.edu.tr", "GEBZE TECHNICAL UNIVERSITY", "EMAIL LIST");
        EmailAddress term = new GroupMail("myterm@gtu.edu.tr", "4th", "Email List");
        EmailAddress home = new GroupMail("homemail@gmail.com", "HOME", "MAIL LIST");

        home.addEmail(person1);
        home.addEmail(person2);
        home.addEmail(person3);
        home.addEmail(person4);

        term.addEmail(person5);
        term.addEmail(person6);
        term.addEmail(person7);
        term.addEmail(person8);

        university.addEmail(person10);
        university.addEmail(term);

        myAdressBook.addEmailAddress(person9);
        myAdressBook.addEmailAddress(university);
        myAdressBook.addEmailAddress(home);

        myAdressBook.printMyMailList();

    }
}
