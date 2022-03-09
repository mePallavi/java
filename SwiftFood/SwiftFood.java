class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

	public void displayCustomerDetails() 
    {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}

class Food {
    String foodName;
    String cuisine;
    String foodType;
    int quantityAvailable;
    double unitPrice;
}

public class SwiftFood {
    public static void main(String[] args) 
    {
        //object creation
        // customer is reference variable as it refers to object
        Customer customer = new Customer();
        //Food food = new Food();

        // Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

        customer.displayCustomerDetails();
        
        
    }
}
