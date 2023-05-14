package ModelData;

import java.util.Date;

public class Orders {
    private int id;
    private int quantity;
    private Date date;
    private int id_client;
    private int id_product;

    public Orders() {
    }

    public Orders(int id, int quantity, Date date, int id_client, int id_product) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.date = date;
        this.id_client = id_client;
        this.id_product = id_product;
    }

    public Orders(int quantity, Date date, int id_client, int id_product) {
        super();
        this.quantity = quantity;
        this.date = date;
        this.id_client = id_client;
        this.id_product = id_product;
    }

    /**
     * getter for id
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * getter for quantity
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * getter for date
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * getter for id_client
     *
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * getter for id_product
     *
     * @return the id_product
     */
    public int getId_product() {
        return id_product;
    }

    /**
     * setter for id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * setter for quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * setter for date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * setter for address
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    /**
     * setter for address
     */
    public void setId_product(int id_product) {
        this.id_product = id_product;
    }
}