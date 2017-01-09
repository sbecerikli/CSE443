package RMI_Client;

import RemoteIF.RemoteIF;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by Seyfullah Becerikli on 17/12/2016.
 */
public interface ClientIF extends RemoteIF {
    void ClientLoginMenu() throws IOException, ClassNotFoundException;
    void ClientProcessMenu() throws IOException, ClassNotFoundException;
    String getId() throws RemoteException;
    String getPassword() throws RemoteException;
}
