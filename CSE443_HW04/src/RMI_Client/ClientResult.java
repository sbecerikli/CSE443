package RMI_Client;


import javax.swing.*;

/**
 * Created by seyfullah on 02.01.2017.
 */
public class ClientResult extends JFrame{
    private JFrame frame;
    private JPanel panel;
    private JTextField balanceField, pathField, distanceField;
    private JLabel labelBalance, labelPath, labelDistance;

    public JTextField getBalanceField() {
        return balanceField;
    }

    public void setBalanceField(JTextField balanceField) {
        this.balanceField = balanceField;
    }

    public JTextField getPathField() {
        return pathField;
    }

    public void setPathField(JTextField pathField) {
        this.pathField = pathField;
    }

    public JTextField getDistanceField() {
        return distanceField;
    }

    public void setDistanceField(JTextField distanceField) {
        this.distanceField = distanceField;
    }

    public ClientResult(){
        super("Result");
        setBounds(100, 100, 500, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        labelBalance = new JLabel("Balance: ");
        labelBalance.setBounds(20, 20, 300, 20);
        labelPath = new JLabel("Dijkstra shortest Path: ");
        labelPath.setBounds(20, 60, 300, 20);
        labelDistance = new JLabel("Distance");
        labelDistance.setBounds(20, 100, 300, 20);

        balanceField = new JTextField();
        balanceField.setBounds(200, 20, 200, 20);

        pathField = new JTextField();
        pathField.setBounds(200, 60, 200, 20);

        distanceField = new JTextField();
        distanceField.setBounds(200, 100, 200, 20);

        panel.add(labelBalance);
        panel.add(labelPath);
        panel.add(labelDistance);
        panel.add(balanceField);
        panel.add(pathField);
        panel.add(distanceField);

        add(panel);
    }

    public static void main(String[] args){
        ClientResult c = new ClientResult();

    }

}
