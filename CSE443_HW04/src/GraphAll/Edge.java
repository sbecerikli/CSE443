package GraphAll;

import java.rmi.RemoteException;
import java.io.Serializable;

/**
 * Created by Seyfullah Becerikli on 01/01/2017.
 */
public class Edge implements Comparable<Edge>, Serializable{

    private Vertex one, two;
    private int weight;

    
    public Edge(Vertex one, Vertex two) throws RemoteException {
        this(one, two, 1);
    }

    public Edge(Vertex one, Vertex two, int weight) throws RemoteException {
        this.one = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
        this.two = (this.one == one) ? two : one;
        this.weight = weight;
    }


    public Vertex getNeighbor(Vertex current) throws RemoteException {
        if(!(current.equals(one) || current.equals(two))){
            return null;
        }

        return (current.equals(one)) ? two : one;
    }

    public Vertex getOne() throws RemoteException {
        return this.one;
    }

    public Vertex getTwo() throws RemoteException {
        return this.two;
    }


    public int getWeight() throws RemoteException {
        return this.weight;
    }


    public void setWeight(int weight) throws RemoteException {
        this.weight = weight;
    }


    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }

    public String toString() {
        return "({" + one + ", " + two + "}, " + weight + ")";
    }


    public int hashCode(){
        try {
            return (one.getLabel() + two.getLabel()).hashCode();
        } catch (RemoteException e) {
            e.printStackTrace();
            return 0;
        }
    }


    public boolean equals(Object other){
        if(!(other instanceof Edge)){
            return false;
        }

        Edge e = (Edge)other;

        return e.one.equals(this.one) && e.two.equals(this.two);
    }
}
