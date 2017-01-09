package RMI_Client;

import RMI_Server.ServerIF;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Seyfullah Becerikli on 17/12/2016.
 */
public class ClientDriver {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        String serverUrl = "rmi://localhost/RMIServer";
        ServerIF server = (ServerIF) Naming.lookup(serverUrl);
        new Thread(new Client(server)).start();

    }
}
