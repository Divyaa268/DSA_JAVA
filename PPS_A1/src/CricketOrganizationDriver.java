// ---------------------------------------------------
// Assignment 1
// © Divya Divya
// Written by: Divya DIVYA, Student ID : 40190738
// ---------------------------------------------------


import java.util.*;

/**
 * The CricketOrganizationDriver class provides the main functionality for a Cricket Organization Software Application
 * where the user can add new Cricketers, update Cricketer information, display all available Cricketers with a bowling average less than the user input,
 * display all Cricketers that can play as an all-rounder if they have a required strike and economy rate.
 */

public class CricketOrganizationDriver {

    /**
     * Display the main menu for the application.
     *
     * @return A string containing the main menu options.
     */
    public static String displayMainMenu()
    {
        return "\nWhat do you want to do?\n" +
                "1. Enter new Cricketers (password required).\n" +
                "2. Change information of a Cricketer (password required).\n" +
                "3. Display available Cricketers with a bowlingAvg greater than user value.\n" +
                "4. Display all Cricketers that can play as an AllRounder.\n" +
                "5. Quit\n" +
                "\nPlease enter your choice > ";
    }

    /**
     * Display the update menu for changing Cricketer information.
     *
     * @return A string containing the update menu options.
     */
    public static String displayUpdateMenu()
    {
        return "What information would you like to change?\n" +
                "1. Name\n" +
                "2. Batting Average\n" +
                "3. Bowling Average\n" +
                "4. Strike Rate\n" +
                "5. Economy\n" +
                "6. Availability\n" +
                "7. Quit\n" +
                "\n Enter your choice > " ;
    }


    /**
     * Find and display Cricketers with a bowling average less than the specified value.
     *
     * @param maxBowlingAvg The maximum bowling average for Cricketers to be displayed.
     * @param cricketerDatabase The array of Cricketers to search in.
     */
    private static void findCricketersBy(float maxBowlingAvg, Cricketer[] cricketerDatabase)
    {
        System.out.println("Cricketers with bowlingAvg less than " + maxBowlingAvg + " are : ");
        boolean found = false; // Flag to track if any cricketer is found

        for (Cricketer cricketer : cricketerDatabase)
        {
            if (cricketer != null && cricketer.getIsAvailable() && cricketer.getBowlingAvg() < maxBowlingAvg)
            {
                System.out.println(cricketer);

                found = true;
            }
        }

        if (!found)
        {
            System.out.println("Cricketers with given bowling average do not exist!");
        }
    }

    /**
     * Find and display Cricketers who can play as All-Rounders based on strike rate and economy rate.
     *
     * @param strikeRate The minimum strike rate for All-Rounder consideration.
     * @param economyRate The maximum economy rate for All-Rounder consideration.
     * @param cricketerDatabase The array of Cricketers to search in.
     */
    private static void findAllRounders(float strikeRate, float economyRate, Cricketer cricketerDatabase[])
    {
        System.out.println("All-Rounder Cricketers are : ");
        boolean found = false; // Flag to track if any cricketer is found

        for (Cricketer cricketer : cricketerDatabase)
        {
            if (cricketer != null && cricketer.getStrikeRate() > strikeRate && cricketer.getEconomyRate() < economyRate)
            {
                System.out.println(cricketer);

                found = true;
            }
        }

        if (!found)
        {
            System.out.println("Cricketer with given strike rate and economy rate do not exist!");
        }
    }


    /**
     * Display information about a specific Cricketer.
     *
     * @param C The Cricketer object to display information about.
     * @return A string containing the Cricketer's information.
     */
    public static void displayCricketerInfo(Cricketer C)
    {
        System.out.println(C);
    }

    /**
     * This is the main method of the CricketOrganizationDriver class, which serves as the entry point of the program.
     * It provides a menu-based interface for users to interact with the Cricket Organization Software Application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Cricket Organization Software Application ");

        System.out.println("Enter maximum number of Cricketers : ");
        int maxCricketers = sc.nextInt();

        // Creating an array to keep track of all the created Cricketer objects
        Cricketer cricketerDatabase[] = new Cricketer[maxCricketers];

        // Add index of cricketer
        int indexOfCricketerDB = 0;


        // to keep track of failed attempts to enter the correct password
        int failedAttempts = 0;

        // display the Main Menu repeatedly until the user selects the exit option
//        displayMenu:

        while (true)
        {
            System.out.print(displayMainMenu());

            // to take user input for their choice from Main Menu between 1 and 5
            int userChoice = sc.nextInt();

            if (userChoice >= 1 && userChoice <= 5)
            {
                // making password final to keep it constant and so it can't be changed
                final String password = "password";

                switch (userChoice) {
                    case 1:
                        passwordmenu:
                        while(true)
                        {
                            // Prompt user to provide password to access application
                            System.out.print("Please enter the password to access the application : ");

                            // Input password from the user
                            String userPassword = sc.next();

                            passwordmenu2:
                            while (true)
                            {
                                // Scenario when correct password has been entered by the user
                                if (userPassword.equals(password))
                                {
                                    // Prompt user to provide the umber of users they want to enter
                                    System.out.print("Please enter the number of Cricketers you want to add : ");
                                    int numberOfCricketersEntered = sc.nextInt();

                                    // Checking if we have enough space to add Cricketers, and giving exact space we have to add the cricketers
                                    if (numberOfCricketersEntered > maxCricketers - Cricketer.getNumberOfCricketers())
                                    {
                                        // Scenario when we don't have enough space to add number of cricketers provided by the user
                                        System.out.println("Sorry! You can only add " + (maxCricketers - Cricketer.getNumberOfCricketers()) + " Cricketers.");
                                        break passwordmenu;
                                    }
                                    else // we have enough space to add number of cricketers provided by the user
                                    {
                                        for (int i = 0; i < numberOfCricketersEntered; i++)
                                        {
                                            // prompting the user to provide all the required cricketer information to add them
                                            System.out.println("Enter the information of Cricketer " + (i + 1) + " - ");

                                            System.out.println("Enter name of the Cricketer : ");
                                            String name = sc.next();

                                            System.out.println("Enter Batting Average of the Cricketer : ");
                                            float battingAvg = sc.nextFloat();

                                            System.out.println("Enter Bowling Average of the Cricketer : ");
                                            float bowlingAvg = sc.nextFloat();

                                            System.out.println("Enter Strike Rate of the Cricketer : ");
                                            float strikeRate = sc.nextFloat();

                                            System.out.println("Enter Economy Rate of the Cricketer : ");
                                            float economyRate = sc.nextFloat();

                                            System.out.println("Enter Availability of the Cricketer (true/false) : ");
                                            boolean isAvailable = sc.nextBoolean();

                                            // initializing the Cricketer object with the user input
                                            Cricketer c = new Cricketer(name, battingAvg, bowlingAvg, strikeRate, economyRate, isAvailable);

                                            // and then adding to array 'cricketerDatabase'
                                            cricketerDatabase[indexOfCricketerDB] = c;

                                            System.out.println(" Added at Index " + indexOfCricketerDB);
                                            indexOfCricketerDB++;
                                            System.out.println("Updated Index Value  is " + indexOfCricketerDB);

                                            if(i == numberOfCricketersEntered-1)
                                            {
                                                break passwordmenu;
                                            }
                                        }
                                    }
                                }
                                else  // scenario when user inputs wrong password
                                {
                                    // incrementing variable when wrong password is provided by user
                                    failedAttempts++;

                                    // checking if user inputs wrong password 12 times, if yes, perform system exit
                                    if (failedAttempts == 12)
                                    {
                                        System.out.println("Program detected suspicious activities and will terminate immediately!");
                                        System.exit(0);
                                    }
                                    // checking if user inputs wrong password 3 or its multiple times, if yes, return to main menu
                                    else if (failedAttempts % 3 == 0)
                                    {
                                        System.out.println("You have entered incorrect password too many times. Please try again later.");
                                        break passwordmenu;
                                    }
                                    // checking if user inputs wrong password less than 3 times, if yes, ask user to re-enter password
                                    else
                                    {
                                        System.out.println("You have entered incorrect password. Please try again! ");
                                        break passwordmenu2;
                                    }
                                }
                            }
                        }

                        break;
                    case 2:

                        case2passwordMenu:
                        while(true) {
                            System.out.print("Enter the password to access the application : ");
                            String enteredPassword = sc.next();

                            beginning:
                            if (enteredPassword.equals(password)) { // scenario when correct password is provided by user

                                beginning2:
                                while (true) {

                                    Cricketer targetCricketer = null;

                                    // prompting user to enter cricketer id of the cricketer they want to update the information of
                                    System.out.print("Enter the CricketerID of the Cricketer that you wish to update : ");
                                    long enteredCrickerterID = sc.nextLong();

                                    // looping over cricketerDB array to search for the cricketer with provided ID
                                    for (int i = 0; i <= cricketerDatabase.length - 1; i++)
                                    {
                                        // check if entered cricketer id exists in cricketerDatabase array
                                        if (cricketerDatabase[i] != null && i == enteredCrickerterID) { // Comparing Index

//                                        if (cricketerDatabase[i] != null && i.equals(enteredCrickerterID))
//                                        if (cricketerDatabase[i] != null && cricketerDatabase[i].equals(enteredCrickerterID)) {
                                            //  code when the condition is true.
                                            // add cricketer to update

                                            targetCricketer = cricketerDatabase[i];

                                            // calling displayCricketerInfo function to display information
                                            displayCricketerInfo(targetCricketer);
                                        }
                                    }

                                    // Scenario if entered cricketer id does not exist in cricketerDatabase array
                                    // then either ask user to re-enter id or quit to go to main menu
                                    if (targetCricketer == null)
                                    {
                                        System.out.println("There is no Cricketer with the entered CricketerID!");
                                        System.out.println("Do you wish to re-enter another Cricketer or quit this operation and go back to the Main Menu? ");
                                        System.out.println("Type 'Yes' to re-enter CricketerID or type 'No' to quit and go to Main Menu");

                                        // Prompt user to enter 'yes' or 'no' for their decision to continue/re-try or quit to main menu
                                        String userInput = sc.next();

                                        if (userInput.equalsIgnoreCase("Yes"))  // scenario for re-enter cricketerID
                                        {
                                            continue;
                                        }
                                        else    // go to main menu
                                        {
                                            break case2passwordMenu;
                                        }
                                    }
                                    // displaying Update menu
                                    while (true)
                                    {
                                        System.out.println(displayUpdateMenu());

                                        // ask user to input option 1 to 7 from Update menu
                                        int userUpdateInput = sc.nextInt();

                                        if (userUpdateInput >= 1 && userUpdateInput <= 7)
                                        {
                                            switch (userUpdateInput) {
                                                case 1:

                                                    // ask user to input name to be updated
                                                    System.out.println("Enter Cricketer Name to be updated : ");
                                                    String updatedName = sc.next();

                                                    // update with input provided
                                                    targetCricketer.setCricketerName(updatedName);

                                                    // displaying cricketer information after update to make sure update happened
                                                    displayCricketerInfo(targetCricketer);

                                                    break;

                                                case 2:

                                                    // ask user to input Batting Average to be updated
                                                    System.out.println("Enter Batting Average to be updated : ");
                                                    float battingAvg = sc.nextFloat();

                                                    // update with input provided
                                                    targetCricketer.setBattingAvg(battingAvg);

                                                    // displaying cricketer information after update to make sure update happened
                                                    displayCricketerInfo(targetCricketer);

                                                    break;

                                                case 3:

                                                    // ask user to input Bowling Average to be updated
                                                    System.out.println("Enter Bowling Average to be updated : ");
                                                    float bowlingAvg = sc.nextFloat();

                                                    // update with input provided
                                                    targetCricketer.setBowlingAvg(bowlingAvg);

                                                    // displaying cricketer information after update to make sure update happened
                                                    displayCricketerInfo(targetCricketer);

                                                    break;

                                                case 4:

                                                    // ask user to input Strike Rate to be updated
                                                    System.out.println("Enter Strike Rate to be updated : ");
                                                    float strikeRate = sc.nextFloat();

                                                    // update with input provided
                                                    targetCricketer.setStrikeRate(strikeRate);

                                                    // displaying cricketer information after update to make sure update happened
                                                    displayCricketerInfo(targetCricketer);

                                                    break;

                                                case 5:

                                                    // ask user to input Economy rate to be updated
                                                    System.out.println("Enter Economy to be updated : ");
                                                    float economyRate = sc.nextFloat();

                                                    // update with input provided
                                                    targetCricketer.setEconomyRate(economyRate);

                                                    // displaying cricketer information after update to make sure update happened
                                                    displayCricketerInfo(targetCricketer);

                                                    break;

                                                case 6:

                                                    // ask user to input Availability to be updated
                                                    System.out.println("Enter Availability to be updated : ");
                                                    boolean availability = sc.nextBoolean();

                                                    // update with input provided
                                                    targetCricketer.setIsAvailable(availability);

                                                    // displaying cricketer information after update to make sure update happened
                                                    displayCricketerInfo(targetCricketer);

                                                    break;

                                                case 7:

                                                    // If user selects 7, main menu is displayed
                                                    System.out.println("Quitting the Application");

                                                    break case2passwordMenu;

                                                default:

                                                    // when user provides invalid input, ask user to input a valid value between 1-7
                                                    System.out.println("You've entered an invalid input choice! Please enter a valid choice");
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                // scenario for Wrong password input
                                failedAttempts++;

                                if (failedAttempts % 3 == 0)
                                {
                                    System.out.println("You have entered the incorrect password too many times. Please try again later.");
                                    break;
                                }
                                else
                                {
                                    // ask user to re-enter the password
                                    System.out.println("You have entered the incorrect password. Please try again.");
                                    continue;
                                }
                            }
                        }
                                break;

                            case 3:
                                // Prompt user to Enter maximum bowling average
                                System.out.println("Enter desired maximum bowling average : ");
                                float enteredMaxBowlingAvg = sc.nextFloat();

                                // display all available cricketers with bowling average less than input value
                                findCricketersBy(enteredMaxBowlingAvg, cricketerDatabase);
                            break;

                    case 4:
                        // Prompt user to Enter maximum strike rate and  minimum economy rate
                        System.out.println("Enter minimum strike rate and maximum economy rate needed : ");
                        float strikeRate = sc.nextFloat();
                        float economyRate = sc.nextFloat();

                        // display cricketers with better strike rate and lower economy rate than input value
                        findAllRounders(strikeRate, economyRate, cricketerDatabase);
                        break;

                    case 5:
                        // Exit from the application
                        System.out.println("Thank you for using the Cricket Organization Software Application.");
                        System.exit(0);
                        break;

                    default:
                        // Ask user to input a valid value when he/she provides invalid option
                        System.out.println("Please enter a valid number present in the Main Menu. Any other input is invalid!");
                        break;
                }
            }
            else
            {
                System.out.println("Invalid choice! Enter a value between 1 and 5,");
                continue;
            }
        }
    }
}