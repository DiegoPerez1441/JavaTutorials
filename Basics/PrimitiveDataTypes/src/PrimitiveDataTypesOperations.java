public class PrimitiveDataTypesOperations {

    public static void main(String[] args) {

        /**
            As you learned previously data types are used to distinguish different types of data
            Here we're going to experiment what kinds of data types can be "combined" and what kinds of operations you can do on them
         **/

        int bankAccountMoney = 4096;
        int paycheck = 812;
        int totalInBankAccount = bankAccountMoney + paycheck; // Allowed
        System.out.println(totalInBankAccount);

        // NOT Allowed
        // boolean gotPayed = true;
        // int totalInBankAccountError = bankAccountMoney + gotPayed;
        // System.out.println(totalInBankAccountError);

        int secondsInAMinute = 60;
        long seconds = 60000000;
        long minutes = seconds / secondsInAMinute; // Allowed
        // This worlds because since a long is bigger than an int it can store int(s) inside of it without overflowing or causing problems

    }

}
