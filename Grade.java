import java.util.Scanner;

/** Holds all the methods used to run the Letter Grade Converter App */

public class Grade 
{
    // Scanner used only wihtin the Grade class
    static private Scanner scanner = new Scanner(System.in);


    /**
     * Prompt the User for Grade input as a percentage
     * @return The Users percent grade as a float
     */
    static Float percentGrade()
    {
        // Variables
        Float grade = 0f;
        boolean validOption;

        // Ask user for grade
        System.out.print("Enter your grade percentage: ");

        // Change text colour to blue
        Colours.setColour(Colour.BLUE.bright());
        // get the next line of input float
        try 
        {
            grade = Float.parseFloat(scanner.nextLine());    
        } catch (Exception exception) 
        {
            // Change text colour to red 
            Colours.setColour(Colour.RED.bright());
            // Print Error message
            System.out.println("Error - Grade percentage must be numeric!\n");
            // Reset colour
            Colours.resetColours();
            // Prompt user for grade percentage again
            grade = percentGrade();
        }
        // Reset colour
        Colours.resetColours();

        // Check the user input if valid
        validOption = grade >= 0 && grade <= 100;
        if (!validOption)
        {
            // Change text colour to red 
            Colours.setColour(Colour.RED.bright());
            // Print Error message
            System.out.println("Error - Grade percentage must be between 0 and 100 percent!\n");
            // Reset colour
            Colours.resetColours();
            // Prompt user for grade percentage again
            grade = percentGrade();
        }


        // return valid input grade
        return grade;
    }


    /**
     * Checks what the letter grade is using the grade percent
     * @param userInput user grade input
     * @return The user letter Grade
     */
    static String letterGrade(Float userInput)
    {
        // Variable 
        String letterGrade = "";
        int wholeInput = 0;

        // round of the grade to nearest whole number
        wholeInput = Math.round(userInput);

        // Check the letter Grade for rounded grad percent
        if (wholeInput >= 0 && wholeInput <= 49) 
        letterGrade = "F";
    
        else if(wholeInput >= 50 && wholeInput <= 54)
        letterGrade = "D-";

        else if(wholeInput >= 55 && wholeInput <= 59)
        letterGrade = "D+";

        else if(wholeInput >= 60 && wholeInput <= 64)
        letterGrade = "C";

        else if(wholeInput >= 65 && wholeInput <= 69)
        letterGrade = "B-";

        else if(wholeInput >= 70 && wholeInput <= 74)
        letterGrade = "B";

        else if(wholeInput >= 75 && wholeInput <= 79)
        letterGrade = "B+";

        else if(wholeInput >= 80 && wholeInput <= 84)
        letterGrade = "A-";

        else if(wholeInput >= 85 && wholeInput <= 89)
        letterGrade = "A";

        else if(wholeInput >= 90 && wholeInput <= 100)
        letterGrade = "A+";

        return letterGrade;
    }


    /**
     * Checks what the grade feedback is using the letter Grade
     * @param letterGrade users determined letter Grade
     * @return The users grade feedback
     */
    static String gradeFeedback(String letterGrade)
    {
        // Variables
        String feedback = "";
        
        // Check for the grade feedback using letterGrade
        if (letterGrade.equals("F")) 
        feedback = "Fail";

        else if (letterGrade.equals("D-")) 
        feedback = "Conditional Pass";

        else if (letterGrade.equals("D+")) 
        feedback = "Conditional Pass";

        else if (letterGrade.equals("C")) 
        feedback = "Acceptable";

        else if (letterGrade.equals("B-")) 
        feedback = "Satisfactory";

        else if (letterGrade.equals("B")) 
        feedback = "Good";

        else if (letterGrade.equals("B+")) 
        feedback = "Very Good";

        else if (letterGrade.equals("A-")) 
        feedback = "Excellent";

        else if (letterGrade.equals("A")) 
        feedback = "Exemplary";

        else if (letterGrade.equals("A+")) 
        feedback = "Outstanding";

        return feedback;
    }
}
