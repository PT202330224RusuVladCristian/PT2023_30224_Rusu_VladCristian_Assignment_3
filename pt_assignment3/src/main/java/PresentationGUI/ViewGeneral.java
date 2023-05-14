package PresentationGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewGeneral extends JFrame{
    private final JButton btnClient;
    private final JButton btnProduct;
    private final JButton btnOrder;
    public ViewGeneral()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("Select Operation");
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel selectOperationLabel = new JLabel("Select Operation");
        selectOperationLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        selectOperationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnClient = new JButton("Client");
        btnClient.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnClient.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnProduct = new JButton("Product");
        btnProduct.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnProduct.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnOrder = new JButton("Order");
        btnOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnOrder.setAlignmentX(Component.CENTER_ALIGNMENT);

        contentPane.add(selectOperationLabel);
        contentPane.add(Box.createRigidArea(new Dimension(0, 30)));
        contentPane.add(btnClient);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(btnProduct);
        contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
        contentPane.add(btnOrder);

        setContentPane(contentPane);


    }
    public void clientListener(ActionListener client) {
        btnClient.addActionListener(client);
    }

    public void productListener(ActionListener product) {
        btnProduct.addActionListener(product);
    }

    public void orderListener(ActionListener order) {
        btnOrder.addActionListener(order);
    }
}
