package ModelData;

public class Product {
    private int id;
    private String name;
    private int stock;
    private int price;
    public Product() {
    }

    public Product(int id, String name, int price, int stock) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, int price, int stock) {
        super();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    /**
     * getter for id
     *
     * @return the id
     */
    public int getId()
    {
        return this.id;
    }
    /**
     * getter for name
     *
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }
    /**
     * getter for stock
     *
     * @return the stock
     */
    public int getStock()
    {
        return this.stock;
    }
    /**
     * getter for price
     *
     * @return the price
     */
    public int getPrice()
    {
        return this.price;
    }
    /**
     * setter for Id
     *
     */
    public void setId(int id)
    {
        this.id=id;
    }
    /**
     * setter for name
     *
     */
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * setter for stock
     *
     */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    /**
     * setter for price
     *
     */
    public void setPrice(int price)
    {
        this.price=price;
    }




}
