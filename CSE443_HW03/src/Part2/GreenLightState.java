package Part2;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public class GreenLightState implements State, Observer {
    Observable o;
    private int timeout_X;

    KocaeliTraffic k;

    public GreenLightState(KocaeliTraffic k, Observable o){
        this.k = k;
        this.o = o;
        o.addObserver((Observer) this);
        timeout_X = 60;
    }

    @Override
    public void ChangeStateToRed() {

    }

    @Override
    public void ChangeStateToYellow() {
        if (k.GetTimeOut() >= GetTimOutX()){
            System.out.println("CHANGE TO YELLOW..");
            k.SetState(k.GetYellowLightState());
            k.SetTimeOut(0);
        }

    }

    @Override
    public void ChangeStateToGreen() {

    }

    public int GetTimOutX(){
        return timeout_X;
    }

    public void SetTimeOutX(int t){
        this.timeout_X = t;
    }

    @Override
    public String toString() {
        return "GreenLightState";
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof HiTech){
            HiTech h = (HiTech) o;
            System.out.println("Timout changeing");
            if (h.GetTrafficStatus()){
                this.SetTimeOutX(90);
            }
            else{
                this.SetTimeOutX(60);
            }
        }
    }
}
