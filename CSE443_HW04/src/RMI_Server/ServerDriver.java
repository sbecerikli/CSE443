package RMI_Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by Seyfullah Becerikli on 17/12/2016.
 */
public class ServerDriver {

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Naming.rebind("RMIServer", new Server());
    }
}
