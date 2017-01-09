package Part1.Store;

import Part1.ComponentFactory.GLOBALPhoneComponentFactory;
import Part1.ComponentFactory.PhoneComponentFactory;
import Part1.PhoneModel.*;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class GLOBALPhoneStore extends PhoneStore {
    @Override
    public Phone CreatePhone(String i) {
        Phone newPhone = null;

        PhoneComponentFactory GlobalPhoneComponentFactory = new GLOBALPhoneComponentFactory();

        if (i.equals(PhoneModelEnum.MAXIMUMEFFORT.getModel())){
            newPhone = new MaximumEffortModel(GlobalPhoneComponentFactory);
            newPhone.setPhoneName("GLOBAL MaximumEffort Phone");
        }
        else if(i.equals(PhoneModelEnum.IFLASDELUXE.getModel())){
            newPhone = new IflasDeluxeModel(GlobalPhoneComponentFactory);
            newPhone.setPhoneName("GLOBAL IflasDeluxe Phone");
        }
        else if(i.equals(PhoneModelEnum.IIAMANIFLAS.getModel())){
            newPhone = new IIAmanIflasModel(GlobalPhoneComponentFactory);
            newPhone.setPhoneName("GLOBAL I-I-Aman-Iflas Phone");
        }

        return newPhone;
    }

}
