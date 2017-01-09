package GraphAll;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Seyfullah Becerikli on 01/01/2017.
 */
public class Graph extends UnicastRemoteObject implements Serializable{

    private HashMap<String, Vertex> vertices;
    private HashMap<Integer, Edge> edges;

    public Graph() throws RemoteException {
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
    }


    public Graph(ArrayList<Vertex> vertices) throws RemoteException {
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();

        for(Vertex v: vertices){
            this.vertices.put(v.getLabel(), v);
        }

    }


    public boolean addEdge(Vertex one, Vertex two) throws RemoteException {
        return addEdge(one, two, 1);
    }


    public boolean addEdge(Vertex one, Vertex two, int weight) throws RemoteException {
        if(one.equals(two)){
            return false;
        }

        Edge e = new Edge(one, two, weight);
        if(edges.containsKey(e.hashCode())){
            return false;
        }

        else if(one.containsNeighbor(e) || two.containsNeighbor(e)){
            return false;
        }

        edges.put(e.hashCode(), e);
        one.addNeighbor(e);
        two.addNeighbor(e);
        return true;
    }


    public boolean containsEdge(Edge e) throws RemoteException {
        if(e.getOne() == null || e.getTwo() == null){
            return false;
        }

        return this.edges.containsKey(e.hashCode());
    }


    public Edge removeEdge(Edge e) throws RemoteException {
        e.getOne().removeNeighbor(e);
        e.getTwo().removeNeighbor(e);
        return this.edges.remove(e.hashCode());
    }


    public boolean containsVertex(Vertex vertex) throws RemoteException {
        return this.vertices.get(vertex.getLabel()) != null;
    }


    public Vertex getVertex(String label) throws RemoteException {
        return vertices.get(label);
    }

    public boolean addVertex(Vertex vertex, boolean overwriteExisting) throws RemoteException {
        Vertex current = this.vertices.get(vertex.getLabel());
        if(current != null){
            if(!overwriteExisting){
                return false;
            }

            while(current.getNeighborCount() > 0){
                this.removeEdge(current.getNeighbor(0));
            }
        }


        vertices.put(vertex.getLabel(), vertex);
        return true;
    }

    public Vertex removeVertex(String label) throws RemoteException {
        Vertex v = vertices.remove(label);

        while(v.getNeighborCount() > 0){
            this.removeEdge(v.getNeighbor((0)));
        }

        return v;
    }

    public Set<String> vertexKeys() throws RemoteException {
        return this.vertices.keySet();
    }


    public Set<Edge> getEdges() throws RemoteException {
        return new HashSet<Edge>(this.edges.values());
    }

    public HashMap<String, Vertex> getVertices() throws RemoteException {
        return vertices;
    }
}
