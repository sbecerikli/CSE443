package Part2;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public class YellowLightState implements State {

    KocaeliTraffic k;

    public YellowLightState(KocaeliTraffic k){
        this.k = k;
    }

    @Override
    public void ChangeStateToRed() {
        if (k.GetTimeOut() == 3){
            System.out.println("CHANGE TO RED..");
            k.SetState(k.GetRedLidghtState());
            k.SetTimeOut(0);
        }
    }

    @Override
    public void ChangeStateToYellow() {

    }

    @Override
    public void ChangeStateToGreen() {

    }

    @Override
    public String toString() {
        return "YellowLightState";
    }
}
