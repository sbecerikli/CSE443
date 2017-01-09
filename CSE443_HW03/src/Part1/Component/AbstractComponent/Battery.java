package Part1.Component.AbstractComponent;

/**
 * Created by Seyfullah Becerikli on 15/12/2016.
 */
public abstract class Battery {
    private String BatteryType;

    public String getBatteryType() {
        return BatteryType;
    }

    public void setBatteryType(String batteryType) {
        BatteryType = batteryType;
    }
}
