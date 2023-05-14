package ModelData;

import javax.print.DocFlavor;

public class Client {
    private int id;
    private String name;
    private String address;

    public Client() {
    }

    public Client(int id, String name, String address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Client(String name, String address) {
        super();
        this.name = name;
        this.address = address;
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
     * getter for address
     *
     * @return the address
     */
    public String getAddress()
    {
        return this.address;
    }
    /**
     * setter for id
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
     * setter for address
     *
     */
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String toString()
    {
        return "Client "+"id="+this.id+" name="+this.name+" address="+this.address;
    }


}
