package Part2;

import javax.naming.Context;

/**
 * Created by Seyfullah Becerikli on 14/12/2016.
 */
public interface State {
    public void ChangeStateToRed();
    public void ChangeStateToYellow();
    public void ChangeStateToGreen();
}
