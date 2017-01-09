package Part1.ComponentFactory;

import Part1.Component.AbstractComponent.*;
import Part1.Component.EUComponent.*;


/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class EUPhoneComponentFactory implements PhoneComponentFactory {
    @Override
    public Display CreatePhoneDisplay() {
        return new EUDisplay();
    }

    @Override
    public Storage CreatePhoneStorage() {
        return new EUStorage();
    }

    @Override
    public Case CreatePhoneCase() {
        return new EUCase();
    }

    @Override
    public CpuAndRam CreatePhoneCpuAndRam() {
        return new EUCpuAndRam();
    }

    @Override
    public Battery CreatePhoneBattery() {
        return new EUBattery();
    }

    @Override
    public Camera CreatePhoneCamera() {
        return new EUCamera();
    }
}
