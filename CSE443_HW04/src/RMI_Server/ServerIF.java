package RMI_Server;

import RMI_Client.ClientIF;
import RemoteIF.RemoteIF;

import java.rmi.RemoteException;
import java.util.ArrayList;


/**
 * Created by Seyfullah Becerikli on 17/12/2016.
*/
public interface ServerIF extends RemoteIF{
    void RegisterClient(ClientIF client) throws RemoteException;
    void WelcomeScreen() throws RemoteException;
    ArrayList<ClientIF> getClients() throws RemoteException;
}
