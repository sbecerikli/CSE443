package Part2;

import java.util.Observable;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public class HiTech extends Observable {
    private boolean IsTrafficStatusHeavy;



    public void changeDetected(boolean flag){
        if(flag){
            SetTrafficStatus(true);
        }
        else {
            SetTrafficStatus(false);
        }
        setChanged();
        notifyObservers();
    }

    public void SetTrafficStatus(boolean status){
        this.IsTrafficStatusHeavy = status;
    }

    public boolean GetTrafficStatus(){
        return IsTrafficStatusHeavy;
    }
}
