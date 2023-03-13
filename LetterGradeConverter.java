// Name: Zulkifli Salami
// Date: 02/19/2023
// App Name: LetterGradeConverter
// App Description: A java App that will get a grade percentage from a user and convert it to 
// it's equivalent letter grade.

public class LetterGradeConverter 
{
    public static void main(String[] args) 
    {
        // Variables
        boolean restart;
        Float userInput;
        String banner;
        String letterGrade;
        String gradeFeedback;


        // Set the App title
        Console.setTitle("Letter Grade Converter - Zulkifli Salami");


        // Run the app while user wants to restart
        do 
        {
            /** Input Screen *************************************************************/
            // Clear terminal
            Console.clearTerminal();
            // Print the banner from the Console class
            banner = Console.formatBanner("Letter Grade Converter");
            System.out.println(banner);
            

            // Ask user for input
            userInput = Grade.percentGrade();
            /*****************************************************************************/

            /** Output Screen  ***********************************************************/
            // Clear terminal
            Console.clearTerminal();
            // Print the banner from the Console class
            banner = Console.formatBanner("Letter Grade Converter");
            System.out.println(banner);

            // Execute letter Grade method
            letterGrade = Grade.letterGrade(userInput);

            // Execute grade feedback method
            gradeFeedback = Grade.gradeFeedback(letterGrade);

            // Print the formatted Output
            System.out.print("\nA grade of ");
            Colours.setColour(Colour.BLUE.bright());    
            System.out.print(userInput + "%");
            Colours.resetColours();
            System.out.print(" is equivalent to ");
            Colours.setColour(Colour.BLUE.bright());    
            System.out.print(letterGrade);
            Colours.resetColours();
            System.out.print(" which is considered \"");
            Colours.setColour(Colour.BLUE.bright());    
            System.out.print(gradeFeedback);
            Colours.resetColours();
            System.out.print("\"!");
            
            

            // Call the runAgain method from the console class
            restart = Console.runAgain();
        } while (restart);

        // Close the app by closing scanner
        Console.closeScanner();

    }
}
