package Part1;

import Part1.PhoneModel.Phone;
import Part1.Store.EUPhoneStore;
import Part1.Store.GLOBALPhoneStore;
import Part1.Store.PhoneStore;
import Part1.Store.TRPhoneStore;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class Main {
    public static void main(String[] args){

        PhoneStore tr = new TRPhoneStore();
        PhoneStore eu = new EUPhoneStore();
        PhoneStore global = new GLOBALPhoneStore();
        Phone p;

        p = tr.OrderAPhone("max");
        System.out.println(p);

        p = eu.OrderAPhone("max");
        System.out.println(p);

        p = global.OrderAPhone("max");
        System.out.println(p);

        p = tr.OrderAPhone("delux");
        System.out.println(p);

        p = eu.OrderAPhone("delux");
        System.out.println(p);

        p = global.OrderAPhone("delux");
        System.out.println(p);

        p = tr.OrderAPhone("aman");
        System.out.println(p);

        p = eu.OrderAPhone("aman");
        System.out.println(p);

        p = global.OrderAPhone("aman");
        System.out.println(p);

    }
}
