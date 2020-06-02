public class ifthenStatements {

    public static void main(String[] args) {

        /*
            Controlling the flow and how your program runs is an essential part of programming
            It helps you selectively execute certain sections of code based on if a condition gets evaluated
            to true or false (booleans)

            We can achieve this through the use of if-then, if-then-else, switch, and ternary operators and statements
            which are controlled by logical and comparision operators such as:

            Comparision Operators:
                == Equal to
                != Not equal to
                >  Greater than
                <  Less than
                >= Greater than or equal to
                <= Less than or equal to

            Logical Operators:
                && Logical and
                || Logical or
                !  Logical not

                &&: BOTH terms have to be true for this to output true, else outputs false
                ||: EITHER one or BOTH of the terms have to be true for this to output true, if they are BOTH false, it outputs false
                ! : This reverses a boolean expression, so a true boolean will output false, and a false boolean will output true

        */

        boolean isItRaining = true;

        /* If the condition in the parenthesis after the if is evaluated to be true then the code inside
            the {} is run, else the code in the {} following the else is run if that condition turns out to be false */
        if (isItRaining == true) {
            System.out.println("It is raining outside");
        } else {
            System.out.println("It is NOT raining outside");
        }

        System.out.println("____________________");


        /*
            You can also layer if, else if, and else statements to choose what you want to test for with more detail

            To find the output go statement by statement, if it evaluates to false move on to the next one until
            you reach a true statement which runs the code inside its {} or reaches the else statement(if present)
            or ultimately does't run anything and just skips through everything
        */

        byte grade = 82;

        if (grade < 70) {
            System.out.println("You're failing");
        } else if (grade < 80) {
            System.out.println("You're passing!");
        } else if (grade < 90) {
            System.out.println("You have an B!");
        } else if (grade < 100) {
            System.out.println("You have an A!");
        } else {
            System.out.println("You have an A+!");
        }


    }

}
