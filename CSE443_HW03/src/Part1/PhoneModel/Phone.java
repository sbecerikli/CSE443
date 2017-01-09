package Part1.PhoneModel;

import Part1.Component.AbstractComponent.*;
import Part1.ComponentFactory.PhoneComponentFactory;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public abstract class Phone {
    private PhoneComponentFactory componentFactory;

    private String PhoneName;

    private Display PhoneDisplay;
    private Storage PhoneStorage;
    private Battery PhoneBattery;
    private Case PhoneCase;
    private CpuAndRam PhoneCpuAndRam;
    private Camera PhoneCamera;

    public void CreatePhoneMarket(){
        setPhoneDisplay(getComponentFactory().CreatePhoneDisplay());
        setPhoneBattery(getComponentFactory().CreatePhoneBattery());
        setPhoneCamera(getComponentFactory().CreatePhoneCamera());
        setPhoneCase(getComponentFactory().CreatePhoneCase());
        setPhoneCpuAndRam(getComponentFactory().CreatePhoneCpuAndRam());
        setPhoneStorage(getComponentFactory().CreatePhoneStorage());
    }

    public abstract void PhoneDisplayType();
    public abstract void PhoneStorageType();
    public abstract void PhoneBatteryType();
    public abstract void PhoneCaseType();
    public abstract void PhoneCpuAndRamType();
    public abstract void PhoneCameraType();

    public String getPhoneName() {
        return PhoneName;
    }

    public void setPhoneName(String phoneName) {
        PhoneName = phoneName;
    }

    public Display getPhoneDisplay() {
        return PhoneDisplay;
    }

    public void setPhoneDisplay(Display phoneDisplay) {
        PhoneDisplay = phoneDisplay;
    }

    public Storage getPhoneStorage() {
        return PhoneStorage;
    }

    public void setPhoneStorage(Storage phoneStorage) {
        PhoneStorage = phoneStorage;
    }

    public Battery getPhoneBattery() {
        return PhoneBattery;
    }

    public void setPhoneBattery(Battery phoneBattery) {
        PhoneBattery = phoneBattery;
    }

    public Case getPhoneCase() {
        return PhoneCase;
    }

    public void setPhoneCase(Case phoneCase) {
        PhoneCase = phoneCase;
    }

    public CpuAndRam getPhoneCpuAndRam() {
        return PhoneCpuAndRam;
    }

    public void setPhoneCpuAndRam(CpuAndRam phoneCpuAndRam) {
        PhoneCpuAndRam = phoneCpuAndRam;
    }

    public Camera getPhoneCamera() {
        return PhoneCamera;
    }

    public void setPhoneCamera(Camera phoneCamera) {
        PhoneCamera = phoneCamera;
    }

    public PhoneComponentFactory getComponentFactory() {
        return componentFactory;
    }

    public void setComponentFactory(PhoneComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    @Override
    public String toString() {
        return "Phone{" + "\n" +
                "\t\tPhoneName= '" + PhoneName + '\'' + "\n" +
                "\t\tPhoneDisplay= " + PhoneDisplay.getDisplayType() + "\n" +
                "\t\tPhoneStorage= " + PhoneStorage.getStorageType() + "\n" +
                "\t\tPhoneBattery= " + PhoneBattery.getBatteryType() + "\n" +
                "\t\tPhoneCase= " + PhoneCase.getCaseType() + "\n" +
                "\t\tPhoneCpuAndRam= " + PhoneCpuAndRam.getCpuAndRamType() + "\n" +
                "\t\tPhoneCamera= " + PhoneCamera.getCameraType() + "\n" +
                '}';
    }
}
