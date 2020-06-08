public class ParsingValuesFromAString {

    public static void main(String[] args) {

        /*
            Similar to casting, parsing a value from a string is essentially getting a number in a string format
                and parsing(converting) it into a number (int, short, byte, long, double, etc...)
        */

        String year = "2020";
        System.out.println("The current year is: " + year);

        // As you can see this will output "20201" instead of 2021 because it adds it to the end of year as a string and not number
        System.out.println("Next year will be: " + (year + 1));

        // To fix this we need to parse the string
        int nextYear = Integer.parseInt(year) + 1; // This parses(converts) the year into a number and adds 1 to it as a number and not a string
        System.out.println("Next year will be: " + nextYear);

    }

}
