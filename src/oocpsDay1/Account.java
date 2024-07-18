// Create classes that capture bank customers and bank accounts. A customer has a first and last name. An account has a customer and a balance. Make objects for two accounts held by the same customer.

package oocpsDay1;

public class Account {
	private Customer customer;
    private double balance;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account(Customer: " + customer + ", Balance: $" + balance + ")";
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "Johnson");
        Account account1 = new Account(customer, 1500.00);
        Account account2 = new Account(customer, 3000.00);

        System.out.println(account1);
        System.out.println(account2);
    }
}
