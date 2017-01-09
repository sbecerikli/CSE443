package GraphAll;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 * Created by Seyfullah Becerikli on 01/01/2017.
 */
public class Vertex extends UnicastRemoteObject implements Serializable {

    private ArrayList<Edge> neighborhood;
    private String label;

    public Vertex(String label) throws RemoteException {
        this.label = label;
        this.neighborhood = new ArrayList<Edge>();
    }

    public void addNeighbor(Edge edge) throws RemoteException {
        if(this.neighborhood.contains(edge)){
            return;
        }

        this.neighborhood.add(edge);
    }

    public boolean containsNeighbor(Edge other) throws RemoteException {
        return this.neighborhood.contains(other);
    }

    public Edge getNeighbor(int index) throws RemoteException {
        return this.neighborhood.get(index);
    }


    Edge removeNeighbor(int index) throws RemoteException {
        return this.neighborhood.remove(index);
    }

    public void removeNeighbor(Edge e) throws RemoteException {
        this.neighborhood.remove(e);
    }


    public int getNeighborCount() throws RemoteException {
        return this.neighborhood.size();
    }


    public String getLabel() throws RemoteException {
        return this.label;
    }

    public String toString() {
        return "Vertex " + label;
    }


    public int hashCode() {
        return this.label.hashCode();
    }

    public boolean equals(Object other){
        if(!(other instanceof Vertex)){
            return false;
        }

        Vertex v = (Vertex)other;
        return this.label.equals(v.label);
    }

    public ArrayList<Edge> getNeighbors() throws RemoteException {
        return new ArrayList<Edge>(this.neighborhood);
    }

}

