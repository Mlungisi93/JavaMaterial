/*
 * Customer.java
 *
 * Created on 16 April 2008, 09:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package FileAccess.ScannerFileReaderAndPrintWritter;

/**
 Store the data of a Customer - name, address, telephone  number
 @author S Ribeiro
 */
public class Customer 
{
    private String name, address, phoneNo;
        
    /**
     Creates a new instance of Customer with none as the name, address and telephone number
     */
    public Customer()
    {
        this("no name","none","none");
    }
    
    /**
     Create a new customer
     @param name The customer name
     @param address The customer address
     @param phoneNo The customer telephone number
     */
    public Customer(String name, String address, String phoneNo)
    {
        setName(name);
        setAddress(address);
        setPhoneNo(phoneNo);
    }
    
    /**
     Change the name of the customer
     @param name The customer name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     Change the address of the customer
     @param address The customer address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    /**
     Change the telephone number of the customer
     @param phoneNo The customer telephone number
     */
    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }
    
    /**
     Return the telephone number of the customer
     @return The customer telephone number
     */
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    /**
     Return the address of the customer
     @return The customer telephone address
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     Return the name of the customer
     @return The customer name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     Return the information of the customer
     */
    @Override
    public String toString()
    {
        return getClass().getName() + "[name=" + name + ",address=" 
                + address + ",phone =" + phoneNo + "]";
    }

   
    //Invoking the DA methods:
    
    /** Find and return the customer with the matching phone number
     @param phoneNo The phone number used to search for the customer
     @throws NotFoundException Thrown when the customer data (phone number) is not found
     */
    public static Customer find(String phoneNo) throws NotFoundException
    {
        return CustomerDA.find(phoneNo);
    }
    
    /**Add the current customer
     @throws DuplicateException Thrown when a customer with that specific phone number
     exists already
     */
    public void addNew() throws DuplicateException
    {
        CustomerDA.addNew(this); //send the current object

        /*
        Call this add method:
        Customer obj = new Customer(name,address,tel);
        obj.addNew();
        */
    }
    
    /**
     Change the data stored of the current customer
     @throws NotFoundException Thrown when a customer is not found
     */
    public void update() throws NotFoundException
    {
        CustomerDA.update(this);
    }
    
    /**
     Delete the current customer data
     @throws NotFoundException Thrown when a customer is not found
     */
    public void delete() throws NotFoundException
    {
        CustomerDA.delete(this);
    }
    
    /**Initialise the data storage
     * @throws DataStorageException This exception is raised when there was
     * a problem reading from the data storage device
     */
    public static void initialise() throws DataStorageException
    {
        CustomerDA.initialse();
    }
    
    /**Terminate the data storage
     * @throws DataStorageException This exception is raised when there was
     * a problem saving to the data storage device
     */
    public static void terminate() throws DataStorageException
    {
        CustomerDA.terminate();
    }
    
    /** Return the current data stored
     @return Return all the customers in a java.util.ArrayList<Customer>
     */
    public static java.util.ArrayList<Customer> getAll()
    {
        return CustomerDA.getAll();
    }
    
    /**
     * Return the data of all customers with a matching starting code
     * @param startTel The code of the area
     * @return An ArrayList containing all the data.  If none was found
     * null would be returned
     */
     public static java.util.ArrayList<Customer> getAll(String startTel)
    {
        return CustomerDA.getAll(startTel);
    }
    
}
