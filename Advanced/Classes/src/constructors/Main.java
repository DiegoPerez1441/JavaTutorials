package constructors;

public class Main {

    public static void main(String[] args) {

        /*
            Initializing my bank account object
            As you can see this is a lot of typing just to initialize the object by setting the field values for the first time
        */
        // Account myAccount = new Account(); // This is actually calling the constructor AND creating the object
        /*myAccount.setNumber("12345678");
        myAccount.setBalance(0.00);
        myAccount.setCustomerName("Diego Perez");
        myAccount.setCustomerEmailAddress("example@example.com");
        myAccount.setCustomerPhoneNumber("1-800-8000");*/

        // Now we can use the constructor to initialize the account object
        Account myAccount = new Account("12345678", 0.00, "Diego Perez", "example@emaple.com", "1-800-8000");
        // Check to see if myAccount got initialized properly
        System.out.println(myAccount.getNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getCustomerEmailAddress());
        System.out.println(myAccount.getCustomerPhoneNumber());


        System.out.println("____________________");

        myAccount.withdrawal(100.00);

        myAccount.deposit(50.00);
        myAccount.withdrawal(100.00);

        myAccount.deposit(51.00);
        myAccount.withdrawal(100.00);

    }

}
