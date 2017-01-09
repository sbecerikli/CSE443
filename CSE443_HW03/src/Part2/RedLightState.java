package Part2;


import javax.naming.Context;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public class RedLightState implements State {

    KocaeliTraffic k;

    public RedLightState(KocaeliTraffic k){
        this.k = k;
    }

    @Override
    public void ChangeStateToRed() {

    }

    @Override
    public void ChangeStateToYellow() {

    }

    @Override
    public void ChangeStateToGreen() {
        if (k.GetTimeOut() == 15){
            System.out.println("CHANGE TO GREEN..");
            k.SetState(k.GetGreenLightState());
            k.SetTimeOut(0);
        }
    }

    @Override
    public String toString() {
        return "RedLightState";
    }
}
