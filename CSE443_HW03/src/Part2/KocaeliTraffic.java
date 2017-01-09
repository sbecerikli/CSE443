package Part2;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public class KocaeliTraffic {

    private State red;
    private State yellow;
    private State green;
    private HiTech hiTech;

    public State state;
    public int timeout;

    public KocaeliTraffic(){
        hiTech = new HiTech();
        red = new RedLightState(this);
        yellow = new YellowLightState(this);
        green = new GreenLightState(this, hiTech);

        SetState(red);

        this.timeout = 0;
    }

    public void Display(){
        state.ChangeStateToGreen();
        state.ChangeStateToYellow();
        state.ChangeStateToRed();
        ++timeout;
        System.out.println("Time: " + timeout + " State: " + state.toString());
    }

    public void SetHiTechStatus(boolean flag){
        GetHiTech().changeDetected(flag);
    }

    public HiTech GetHiTech(){
        return hiTech;
    }

    public void SwitchToGreen(){
        state.ChangeStateToGreen();
    }

    public void SwitchToRed(){
        state.ChangeStateToRed();
    }

    public void SwitchToYellow(){
        state.ChangeStateToYellow();
    }


    public void SetState(State s){
        this.state = s;
    }

    public State GetState(){
        return state;
    }

    public State GetRedLidghtState(){
        return red;
    }

    public State GetYellowLightState() {
        return yellow;
    }

    public State GetGreenLightState(){
        return green;
    }

    public void SetTimeOut(int timeout){
        this.timeout = timeout;
    }

    public int GetTimeOut(){
        return timeout;
    }
}
