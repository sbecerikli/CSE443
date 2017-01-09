package RMI_Server;

import RemoteIF.RemoteIF;
import RMI_Client.ClientIF;

import Dijkstra.Dijkstra;
import GraphAll.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 * Created by Seyfullah Becerikli on 17/12/2016.
 */
public class Server extends UnicastRemoteObject implements ServerIF, RemoteIF{

    private static final long serialVersionUID = 1L;
    private ArrayList<ClientIF> clients;

    protected Server() throws RemoteException {
        clients = new ArrayList<ClientIF>();
    }

    @Override
    public synchronized void RegisterClient(ClientIF client) throws RemoteException {
        //System.out.println(client.getId());
        //System.out.println(client.getPassword());
        this.clients.add(client);
    }

    @Override
    public void SendMessage(String message, byte[] g, String v1, String v2) throws IOException, ClassNotFoundException {
        int i = 0;
        while (i < clients.size()){

            System.out.println(message);

            Edge[] edges = new Edge[9];

            Object objgraph = null;
            ByteArrayInputStream bis = null;
            ObjectInputStream ois = null;

            bis = new ByteArrayInputStream(g);
            ois = new ObjectInputStream(bis);
            objgraph = ois.readObject();


            edges[0] = new Edge(((Graph)objgraph).getVertex("A0"), ((Graph)objgraph).getVertex("A1"), 7);
            edges[1] = new Edge(((Graph)objgraph).getVertex("A0"), ((Graph)objgraph).getVertex("A3"), 9);
            edges[2] = new Edge(((Graph)objgraph).getVertex("A0"), ((Graph)objgraph).getVertex("A5"), 14);
            edges[3] = new Edge(((Graph)objgraph).getVertex("A1"), ((Graph)objgraph).getVertex("A2"), 10);
            edges[4] = new Edge(((Graph)objgraph).getVertex("A1"), ((Graph)objgraph).getVertex("A3"), 15);
            edges[5] = new Edge(((Graph)objgraph).getVertex("A2"), ((Graph)objgraph).getVertex("A3"), 11);
            edges[6] = new Edge(((Graph)objgraph).getVertex("A2"), ((Graph)objgraph).getVertex("A5"), 2);
            edges[7] = new Edge(((Graph)objgraph).getVertex("A3"), ((Graph)objgraph).getVertex("A4"), 6);
            edges[8] = new Edge(((Graph)objgraph).getVertex("A4"), ((Graph)objgraph).getVertex("A5"), 9);

            //System.out.println();
            for(Edge e: edges){
                ((Graph)objgraph).addEdge(e.getOne(), e.getTwo(), e.getWeight());
            }

            Dijkstra dijkstra = new Dijkstra(((Graph)objgraph), ((Graph)objgraph).getVertex(v1).getLabel());

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            sb1.append(dijkstra.getPathTo(((Graph)objgraph).getVertex(v2).getLabel()));
            sb2.append(dijkstra.getDistanceTo(((Graph)objgraph).getVertex(v2).getLabel()));
            clients.get(i++).GetMessage(sb1.toString(), sb2.toString());
        }
    }

    @Override
    public void GetMessage(String path, String distance) throws RemoteException {

    }

    @Override
    public void WelcomeScreen() throws RemoteException {

    }

    public ArrayList<ClientIF> getClients() throws RemoteException{
        return clients;
    }
}
