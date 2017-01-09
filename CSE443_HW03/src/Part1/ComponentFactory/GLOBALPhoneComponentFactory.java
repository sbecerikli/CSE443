package Part1.ComponentFactory;

import Part1.Component.AbstractComponent.*;
import Part1.Component.GLOBALComponent.*;


/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public class GLOBALPhoneComponentFactory implements PhoneComponentFactory {
    @Override
    public Display CreatePhoneDisplay() {
        return new GLOBALDisplay();
    }

    @Override
    public Storage CreatePhoneStorage() {
        return new GLOBALStorage();
    }

    @Override
    public Case CreatePhoneCase() {
        return new GLOBALCase();
    }

    @Override
    public CpuAndRam CreatePhoneCpuAndRam() {
        return new GLOBALCpuAndRam();
    }

    @Override
    public Battery CreatePhoneBattery() {
        return new GLOBALBattery();
    }

    @Override
    public Camera CreatePhoneCamera() {
        return new GLOBALCamera();
    }
}
