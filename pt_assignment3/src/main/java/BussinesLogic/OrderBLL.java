package BussinesLogic;


import DataAccess.OrdersDAO;
import ModelData.Client;
import ModelData.Orders;
import ModelData.Product;

import java.util.Date;
import java.util.List;

import static java.lang.Integer.parseInt;

public class OrderBLL {
    private final OrdersDAO orderDAO;

    /**
     * Constructor which assigns a OrdersDAO to ordersDAO attribute
     */
    public OrderBLL() {
        orderDAO = new OrdersDAO();
    }

    /**
     * @return a list of all Orders from the Data Base
     */
    public List<Orders> getOrders() {
        return orderDAO.findAll();
    }

    /**
     * Inserts a specified client in the Data Base
     *
     * @param client   a generated client
     * @param product  a generated product
     * @param quantity a specified quantity for the product
     * @param date     the date
     */
    public void makeOrder(Client client, Product product, int quantity, Date date) {
        Orders orders = new Orders(quantity, date, client.getId(), product.getId());
        orderDAO.insert(orders);
    }

    /**
     * Validates a specific quantity for a product
     *
     * @param quantity a specified quantity for the product
     * @param stock    the number of products of a type from the Data Base
     * @return true if the quantity is valid or false otherwise
     */
    public boolean validateQuantity(int quantity, int stock) {
        if (quantity < 0 || quantity > 1000000)
            return false;
        return quantity <= stock;
    }



}
