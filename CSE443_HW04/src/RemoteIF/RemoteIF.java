package RemoteIF;

import GraphAll.Graph;
import GraphAll.Vertex;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by seyfullah on 01.01.2017.
 */
public interface RemoteIF extends Remote {
    void SendMessage(String message, byte[] g, String v1, String v2) throws IOException, ClassNotFoundException;
    void GetMessage(String path, String distance) throws RemoteException;
}
