package Part1.Store;

import Part1.PhoneModel.Phone;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public abstract class PhoneStore {

    public abstract Phone CreatePhone(String i);

    public Phone OrderAPhone(String t){
        Phone newPhone = CreatePhone(t);
        System.out.println("**********Producing a " + newPhone.getPhoneName());
        newPhone.CreatePhoneMarket();
        newPhone.PhoneBatteryType();
        newPhone.PhoneCameraType();
        newPhone.PhoneCaseType();
        newPhone.PhoneCpuAndRamType();
        newPhone.PhoneDisplayType();
        newPhone.PhoneStorageType();

        return newPhone;
    }
}
