package Part1.Store;


import Part1.ComponentFactory.PhoneComponentFactory;
import Part1.ComponentFactory.TRPhoneComponentFactory;
import Part1.PhoneModel.*;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class TRPhoneStore extends PhoneStore {
    @Override
    public Phone CreatePhone(String i) {
        Phone newPhone = null;

        PhoneComponentFactory TrPhoneComponentFactory = new TRPhoneComponentFactory();

        if (i.equals(PhoneModelEnum.MAXIMUMEFFORT.getModel())){
            newPhone = new MaximumEffortModel(TrPhoneComponentFactory);
            newPhone.setPhoneName("TR MaximumEffort Phone");
        }
        else if(i.equals(PhoneModelEnum.IFLASDELUXE.getModel())){
            newPhone = new IflasDeluxeModel(TrPhoneComponentFactory);
            newPhone.setPhoneName("TR IflasDeluxe Phone");
        }
        else if(i.equals(PhoneModelEnum.IIAMANIFLAS.getModel())){
            newPhone = new IIAmanIflasModel(TrPhoneComponentFactory);
            newPhone.setPhoneName("TR I-I-Aman-Iflas Phone");
        }

        return newPhone;
    }
}
