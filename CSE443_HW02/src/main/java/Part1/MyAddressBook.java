package Part1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Seyfullah Becerikli on 22/11/2016.
 */

public class MyAddressBook {
    private List<EmailAddress> myMailList = new LinkedList<EmailAddress>();

    public MyAddressBook(List<EmailAddress> myMailList) {
        this.myMailList = myMailList;
    }

    public void addEmailAddress(EmailAddress mail){
        myMailList.add(mail);
    }

    public void removeMailAddress(EmailAddress mail){
        myMailList.remove(mail);
    }

    public void printMyMailList(){
        for (EmailAddress e : myMailList) {
            e.print();
        }
    }
}
