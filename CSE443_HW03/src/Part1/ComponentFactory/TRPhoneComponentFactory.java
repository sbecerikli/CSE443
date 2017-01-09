package Part1.ComponentFactory;

import Part1.Component.AbstractComponent.*;
import Part1.Component.TRComponent.*;


/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class TRPhoneComponentFactory implements PhoneComponentFactory {
    @Override
    public Display CreatePhoneDisplay() {
        return new TRDisplay();
    }

    @Override
    public Storage CreatePhoneStorage() {
        return new TRStorage();
    }

    @Override
    public Case CreatePhoneCase() {
        return new TRCase();
    }

    @Override
    public CpuAndRam CreatePhoneCpuAndRam() {
        return new TRCpuAndRam();
    }

    @Override
    public Battery CreatePhoneBattery() {
        return new TRBattery();
    }

    @Override
    public Camera CreatePhoneCamera() {
        return new TRCamera();
    }
}
