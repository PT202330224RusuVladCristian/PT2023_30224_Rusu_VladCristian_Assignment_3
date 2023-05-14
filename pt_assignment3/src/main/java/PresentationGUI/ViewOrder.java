package PresentationGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewOrder extends JFrame {
    private final JTextField quantityField;
    private final JTable clientsTable;
    private final JTable productsTable;
    private final JTable ordersTable;
    private final JButton goBackToMenuButton;
    private final JButton makeOrderButton;

    private final DefaultTableModel ordersTableModel;

    /**
     * Builds the Order interface
     *
     * @param ordersModel Model for the orders JTable
     */
    public ViewOrder(DefaultTableModel ordersModel) {
        ordersTableModel = ordersModel;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 999, 645);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel orderOperationsLabel = new JLabel("Order Operations");
        orderOperationsLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        orderOperationsLabel.setBounds(426, 10, 160, 40);
        contentPane.add(orderOperationsLabel);

        goBackToMenuButton = new JButton("Go back to menu");
        goBackToMenuButton.setBounds(0, 587, 131, 21);
        contentPane.add(goBackToMenuButton);

        DefaultTableModel clientsTableModel = new DefaultTableModel();
        clientsTable = new JTable(clientsTableModel) {
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        clientsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        clientsTable.setFillsViewportHeight(true);
        JScrollPane clientsScrollPane = new JScrollPane(clientsTable);
        clientsScrollPane.setBounds(24, 78, 440, 235);
        contentPane.add(clientsScrollPane);

        DefaultTableModel productsTableModel = new DefaultTableModel();
        productsTable = new JTable(productsTableModel) {
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        productsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productsTable.setFillsViewportHeight(true);
        JScrollPane productsScrollPane = new JScrollPane(productsTable);
        productsScrollPane.setBounds(24, 349, 440, 235);
        contentPane.add(productsScrollPane);

        ordersTable = new JTable(ordersTableModel) {
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        ordersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ordersTable.setFillsViewportHeight(true);
        JScrollPane ordersScrollPane = new JScrollPane(ordersTable);
        ordersScrollPane.setBounds(492, 212, 471, 372);
        contentPane.add(ordersScrollPane);

        JLabel insertQuantityLabel = new JLabel("Insert a quantity:");
        insertQuantityLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        insertQuantityLabel.setBounds(601, 92, 125, 26);
        contentPane.add(insertQuantityLabel);

        quantityField = new JTextField();
        quantityField.setBounds(736, 98, 96, 19);
        contentPane.add(quantityField);
        quantityField.setColumns(10);

        makeOrderButton = new JButton("Make order");
        makeOrderButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
        makeOrderButton.setBounds(648, 141, 147, 29);
        contentPane.add(makeOrderButton);

        JLabel lblClientsTable = new JLabel("Clients table");
        lblClientsTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblClientsTable.setBounds(205, 56, 89, 21);
        contentPane.add(lblClientsTable);

        JLabel lblProductsTable = new JLabel("Products table");
        lblProductsTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblProductsTable.setBounds(205, 323, 102, 21);
        contentPane.add(lblProductsTable);

        JLabel lblOrdersTable = new JLabel("Orders table");
        lblOrdersTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblOrdersTable.setBounds(683, 192, 102, 21);
        contentPane.add(lblOrdersTable);
    }

    public String getQuantity() {
        return quantityField.getText();
    }

    public void setQuantity(String s) {
        quantityField.setText(s);
    }

    public int getSelectedClientRow() {
        return clientsTable.getSelectedRow();
    }

    public int getSelectedProductRow() {
        return productsTable.getSelectedRow();
    }

    public void setBtnGoBackToMenuListener(ActionListener buttonGoBack) {
        goBackToMenuButton.addActionListener(buttonGoBack);
    }

    public void setModelClients(DefaultTableModel model) {
        clientsTable.setModel(model);
    }

    public void setModelProducts(DefaultTableModel model) {
        productsTable.setModel(model);
    }

    public void setModelOrders(DefaultTableModel model) {
        ordersTable.setModel(model);
    }

    public JTable getTableClients() {
        return clientsTable;
    }

    public JTable getTableProducts() {
        return productsTable;
    }

    public DefaultTableModel getModelOrders() {
        return ordersTableModel;
    }

    public void makeOrderListener(ActionListener buttonOrder) {
        makeOrderButton.addActionListener(buttonOrder);
    }

}

