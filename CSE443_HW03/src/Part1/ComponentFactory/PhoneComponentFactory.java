package Part1.ComponentFactory;

import Part1.Component.AbstractComponent.*;

/**
 * Created by Seyfullah Becerikli on 16/12/2016.
 */
public interface PhoneComponentFactory {
    public Display CreatePhoneDisplay();
    public Storage CreatePhoneStorage();
    public Case CreatePhoneCase();
    public CpuAndRam CreatePhoneCpuAndRam();
    public Battery CreatePhoneBattery();
    public Camera CreatePhoneCamera();
}
