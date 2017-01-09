package Part1.Store;

import Part1.ComponentFactory.EUPhoneComponentFactory;
import Part1.ComponentFactory.PhoneComponentFactory;
import Part1.PhoneModel.*;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class EUPhoneStore extends PhoneStore {

    @Override
    public Phone CreatePhone(String i) {
        Phone newPhone = null;

        PhoneComponentFactory EuPhoneComponentFactory = new EUPhoneComponentFactory();

        if (i.equals(PhoneModelEnum.MAXIMUMEFFORT.getModel())){
            newPhone = new MaximumEffortModel(EuPhoneComponentFactory);
            newPhone.setPhoneName("EU MaximumEffort Phone");
        }
        else if(i.equals(PhoneModelEnum.IFLASDELUXE.getModel())){
            newPhone = new IflasDeluxeModel(EuPhoneComponentFactory);
            newPhone.setPhoneName("EU IflasDeluxe Phone");
        }
        else if(i.equals(PhoneModelEnum.IIAMANIFLAS.getModel())){
            newPhone = new IIAmanIflasModel(EuPhoneComponentFactory);
            newPhone.setPhoneName("EU I-I-Aman-Iflas Phone");
        }

        return newPhone;
    }
}
