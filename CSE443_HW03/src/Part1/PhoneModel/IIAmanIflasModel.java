package Part1.PhoneModel;

import Part1.ComponentFactory.PhoneComponentFactory;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class IIAmanIflasModel extends Phone {
    public IIAmanIflasModel(PhoneComponentFactory componentFactory){
        setComponentFactory(componentFactory);
        CreatePhoneMarket();

    }

    @Override
    public void PhoneDisplayType() {
        setPhoneDisplay(getComponentFactory().CreatePhoneDisplay());
    }

    @Override
    public void PhoneStorageType() {
        setPhoneStorage(getComponentFactory().CreatePhoneStorage());
    }

    @Override
    public void PhoneBatteryType() {
        setPhoneBattery(getComponentFactory().CreatePhoneBattery());
    }

    @Override
    public void PhoneCaseType() {
        setPhoneCase(getComponentFactory().CreatePhoneCase());
    }

    @Override
    public void PhoneCpuAndRamType() {
        setPhoneCpuAndRam(getComponentFactory().CreatePhoneCpuAndRam());
    }

    @Override
    public void PhoneCameraType() {
        setPhoneCamera(getComponentFactory().CreatePhoneCamera());
    }
}
