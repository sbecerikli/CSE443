package RMI_Client;

import RMI_Server.ServerIF;
import GraphAll.Graph;
import GraphAll.Vertex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 * Created by Seyfullah Becerikli on 17/12/2016.
 */
public class Client extends UnicastRemoteObject implements ClientIF, Runnable {
    private ServerIF server;
    private String id;
    private String password;
    private String clientmessage = null;
    public Graph ClientGraph;
    public Vertex v1;
    public Vertex v2;
    public byte[] bytesgraph = null;
    public int userBalance = 100;

    protected Client(ServerIF server) throws RemoteException {
        
        this.server = server;

    }

    public int getUserBalance() {
        return userBalance;
    }

    @Override
    public void GetMessage(String path, String distance) throws RemoteException {

        ClientResult result = new ClientResult();
        result.getBalanceField().setText("" + (getUserBalance()-5));
        result.getDistanceField().setText(distance);
        result.getPathField().setText(path);


    }

    @Override
    public void ClientLoginMenu() throws IOException, ClassNotFoundException {

        System.out.println("1. Create Account");
        System.out.println("2. Login");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1){

            System.out.println("Enter your ID: ");
            String tempId = scanner.next();
            System.out.println("Enter your Password: ");
            String tempPassword = scanner.next();
            setId(tempId);
            setPassword(tempPassword);
            server.RegisterClient(this);
            JOptionPane.showMessageDialog(null, "Your account created", "Success", 2);
            ClientProcessMenu();

        }
        else if(choice == 2){
            ClientLogin login = new ClientLogin();


            login.getLoginButton().addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    try {
                        for (int i = 0; i < server.getClients().size(); ++i)
                            if(login.getUsernameField().getText().equals(server.getClients().get(i).getId()) && login.getPassField().getText().equals(server.getClients().get(i).getPassword()))
                            {
                                JOptionPane.showMessageDialog(null, "Login Successfull...");
                                try {
                                    login.setVisible(false);
                                    ClientProcessMenu();

                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                } catch (ClassNotFoundException e1) {
                                    e1.printStackTrace();
                                }
                            }
                        else
                            JOptionPane.showMessageDialog(null, "Wrong username or password..");
                    } catch (RemoteException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
        else{
            //
        }

    }

    @Override
    public void ClientProcessMenu() throws IOException, ClassNotFoundException {
        System.out.println("---This is Client's Menu---");
        System.out.println("1. Given a graph, and two nodes A and B, it returns the shortest path between A and B.");
        System.out.println("2. Given a graph it returns the shortest Hamiltonian cycle.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1){
            if(userBalance != 0) {
                //1. islem yap
                ClientGraph = new Graph();
                Vertex[] vertices = new Vertex[6];
                for (int i = 0; i < vertices.length; ++i) {
                    vertices[i] = new Vertex("A" + i);
                    ClientGraph.addVertex(vertices[i], true);
                }

                ByteArrayOutputStream bos = null;
                ObjectOutputStream oos = null;
                bos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(bos);
                oos.writeObject(ClientGraph);
                oos.flush();
                bytesgraph = bos.toByteArray();
                System.out.println("Enter node1 as A1, A2, A3, A4, A5");
                String v1 = scanner.next();
                System.out.println("Enter node2 as A1, A2, A3, A4, A5");
                String v2 = scanner.next();
                clientmessage = "1";
                server.SendMessage("Client choice is: " + clientmessage, bytesgraph, v1, v2);
                clientmessage = "1. choice";
                userBalance -= 5;
                System.out.println("Your Balance: " + userBalance);
                server.GetMessage("121", "asd");
                ClientProcessMenu();
            }
            else{
                System.out.println("your balance is zero. no more calculation.. ");
            }
        }
        else if(choice == 2){
            if(userBalance != 0) {
                //2. islem yap
                clientmessage = "2";
                userBalance -= 10;
            }
        }
        else{
            //hatali secim
            clientmessage = "wrong choice";
        }
    }

    @Override
    public void SendMessage(String message, byte[] g, String v1, String v2) throws RemoteException {

    }

    @Override
    public void run() {
        //Scanner scanner = new Scanner(System.in);
        //String message;
        while (true){
            //message = scanner.nextLine();

            try {
                ClientLoginMenu();

            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
