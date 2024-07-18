// Create classes that capture bank customers and bank accounts. A customer has a first and last name. An account has a customer and a balance. Make objects for two accounts held by the same customer.

package oocpsDay1;

class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer(" + firstName + " " + lastName + ")";
    }
}
