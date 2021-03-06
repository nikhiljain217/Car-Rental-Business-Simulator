import java.util.*;

abstract public class AbstractStore
{
    protected Inventory inventory;
    protected int totalEarnings;
    protected int dailyEarnings;
    protected ArrayList<Customer> customers;
    protected HashSet<RentalRecord> completedRentals;
    protected HashSet<RentalRecord> activeRentals;

    //keep track of total number of rentals by type
    protected int casualRentals;
    protected int regularRentals;
    protected int businessRentals;

    public AbstractStore()
    {
        //keep track of completed and active rentals separately
        completedRentals = new HashSet<RentalRecord>();
        activeRentals = new HashSet<RentalRecord>();
        customers = new ArrayList<Customer>();
        inventory = new Inventory();
    }

    public void addCustomer(Customer c) { customers.add(c); }
    public void removeCustomer(Customer c) { customers.remove(c);}

    public abstract void processBooking(Customer customer, int day);

    public abstract void processReturn(Customer customer);

    //getters and setters
    public Inventory getInventory() { return inventory; }

    public ArrayList<RentalRecord> getCompletedRentals() { return new ArrayList<RentalRecord>(completedRentals); }

    public ArrayList<RentalRecord> getActiveRentals() { return new ArrayList<RentalRecord>(activeRentals); }

    public int getDailyEarnings() { return dailyEarnings; }

    public void setDailyEarnings(int earnings) { dailyEarnings = earnings; }

    public int getTotalEarnings() { return totalEarnings; }

    public abstract Customer getCustomerEligibleToRent(int customerIndex);

    public int getCasualRentals() { return casualRentals; }

    public int getRegularRentals() { return regularRentals; }

    public int getBusinessRentals() { return businessRentals; }

}
