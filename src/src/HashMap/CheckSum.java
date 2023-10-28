package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CheckSum {

    public static void main(String[] args) {

        // declaring MAP
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");
        map.put(7,"G");
        map.put(8,"H");
        map.put(9,"I");

        String finalResultString ="";


        // Inputs
        Scanner sc = new Scanner(System.in);

        int totalInputs = sc.nextInt();

        System.out.println("Total Inputs are "+totalInputs);

        sc.nextLine();

        for (int i = 0; i < totalInputs; i++)
        {

            String input = sc.nextLine();

            // Split the Input into 2 Parts
            String number = input.split(" ")[0];
            String character = input.split(" ")[1];

            System.out.println("Number "+number+" character "+character);

            // Send Number to Function for Processing
            boolean isSingleDigit = false;

            // Result Sum
            int result = Integer.parseInt(number);

            while (!isSingleDigit){ // Process until number becomes single digit

                result = getSum(result);

                // Check if Result is Single Digit
                if(result == 1 || result == 2 || result == 3 || result == 4|| result ==5 || result == 6 || result ==7 || result == 8 || result ==9){
                    isSingleDigit = true; // Number has become single digit
                }

            }

            System.out.println("Single Digit Sum "+result);


            // Check if Mapping Matches the Characters
            if(map.get(result).equals(character))
            {
                System.out.println("Match Found");

                finalResultString = finalResultString+"1";
            }
            else
            {
                System.out.println("Match Not Found");
                finalResultString = finalResultString+"0";

            }
        }
        System.out.println("Final Output -->");
        System.out.println(finalResultString);
    }

    public static int getSum(int number){

        int sum = 0;
        int digit;

        int convertedNumber = number;

        while (convertedNumber != 0){

            digit = convertedNumber % 10;

            sum+= digit;

            convertedNumber = convertedNumber/10;

        }

        return sum;
    }
}