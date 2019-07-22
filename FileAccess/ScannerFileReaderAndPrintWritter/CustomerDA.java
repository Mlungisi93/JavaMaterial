/*
 * CustomerDA.java
 *
 * Created on 16 April 2008, 09:31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package FileAccess.ScannerFileReaderAndPrintWritter;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 * Store and retrieve the Customer data
 * @author S Ribeiro
 */
class CustomerDA
{
    private static ArrayList<Customer> arCustomers;
    private static File customerFile = new File("Customer.txt");

    //Perform initialisation processing
    //Read the data from the file and load it into memory
    static void initialse() throws DataStorageException
    {
        String[] data;
        String line;
        Customer objCust;
        String name, address, tel;

        arCustomers = new ArrayList();

        if (customerFile.exists())
        {
            try
            {
                Scanner in = new Scanner(new FileReader(customerFile));
                while (in.hasNextLine())
                {
                    line = in.nextLine();
                    data = line.split(",");

                    name = data[0];
                    address = data[1];
                    tel = data[2];
                    
                    objCust = new Customer(name, address,tel);
                    arCustomers.add( objCust);
                }
                in.close();
            }
            catch (IOException ex)
            {
                throw new DataStorageException("There was a problem reading " 
                        + "from the da ex.getMessagta storage device.\n " 
                        +ex.getMessage());
            }
        }
        else
        {
          //initial data
        arCustomers.add(new Customer("Sue", "123 First street", "123"));
           arCustomers.add(new Customer("Sue", "123 First street", "123"));
          arCustomers.add(new Customer("Sue", "123 First street", "123"));
          arCustomers.add(new Customer("Sue", "123 First street", "123"));
           arCustomers.add(new Customer("Sue", "123 First street", "123"));
//            
////            if the else section is omitted AND there is no file,
////            then the empty array list would be user
////            (containing no initial data)
        }
    }

    //Perform termination processing
    //store the data that is in the array list to the file
    static void terminate() throws DataStorageException
    {
        Customer temp;
        
        try
        {
            PrintWriter out = new PrintWriter(customerFile);

            for (int i = 0; i < arCustomers.size(); i++)
            {
                temp = arCustomers.get(i);
                out.println(temp.getName() + "," + temp.getAddress() + "," 
                        + temp.getPhoneNo());
            }
            out.close();
        }
        catch (IOException ex)
        {
            throw new DataStorageException("There was a problem saving " 
                    + "to the data storage device.\n " + ex.getMessage());
        }
    }

    //Add a new customer - if there is not a duplicate tel number
    static void addNew(Customer cust) throws DuplicateException
    {
        boolean duplicate = false;
        Customer temp;

        //Test if there are such a customer already in the file
        for (int i = 0; i < arCustomers.size() && !duplicate; i++)
        {
            temp = arCustomers.get(i);
            if (temp.getPhoneNo().equals(cust.getPhoneNo()))
            {
                duplicate = true;
            }
        }

        if (duplicate)
        {
            throw new DuplicateException("Customer exists already. Phone number:" 
                    + cust.getPhoneNo());
        }
        else
        {
            arCustomers.add(cust);
        }
    }

    // Find and return the customer with the matching phone number
    static Customer find(String phoneNo) throws NotFoundException
    {
        Customer cust = null;
        boolean found = false;

        //Test if the phone number exists in the data
        for (int i = 0; i < arCustomers.size() && !found; i++)
        {
            cust = arCustomers.get(i);
            if (phoneNo.equals(cust.getPhoneNo()))
            {
                found = true;
            }
        }

        if (found)
        {
            return cust;
        }
        else
        {
            throw new NotFoundException("Data not found:" + phoneNo);
        }
    }

    //Update the customer information
    static void update(Customer cust) throws NotFoundException
    {
        /*
        No coding needed when sequentail file storage and
        an ArrayList is used.
        A Shallow copy of the customer object returned by the find
        method. It is used by the mutator methods (e.g. setPhoneNo)
         *
         *  Customer objCust = Customer.find("12345");
         *  objCust.setAddress("addrss from text field");
         ***** the object's data is changed by the call to set
         *
         *
         * example that shows the process via a copy of the references:
         * Customer cust = new Customer("Ben", "Vanderbijlpark","0169509000");
         * Customer person = cust;   //Shallow Copy
         * cust.setAddress("Sasol");
         * System.out.println(person.getAddress()); //will print Sasol
         */
    }

   // Delete the customer
    static void delete(Customer cust) throws NotFoundException
    {
        String phoneNo = cust.getPhoneNo();
        boolean found = false;
        Customer temp = null;

        //Test if the phone number exists in the data
        for (int i = 0; i < arCustomers.size() && !found; i++)
        {
            temp = arCustomers.get(i);
            if (phoneNo.equals(temp.getPhoneNo()))
            {
                found = true;
                arCustomers.remove(i); //remove the element
            }
        }

        if (!found)
        {
            throw new NotFoundException("Data not found:" + phoneNo);
        }
    }

    // Return the all customer data currently being stored
    static ArrayList<Customer> getAll()
    {
        return arCustomers;  //return a shallow copy of the data
    }
    
    //example:  all 016 starting numbers will be returned
    static ArrayList<Customer> getAll(String startTel)
    {
        ArrayList arCust = new ArrayList();
        
        for (Customer objCust : arCustomers)
        {
            if (objCust.getPhoneNo().startsWith(startTel))
                arCust.add(objCust);
        }
        
        if (arCust.isEmpty())
            return null;
        else
            return arCust;
    }
}
