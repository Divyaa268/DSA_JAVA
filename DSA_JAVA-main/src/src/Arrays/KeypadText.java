package src.src.Arrays;
import java.util.Scanner;

public class KeypadText
{
    public static void main(String[] args)
    {

        String mapping[] = {" ", "","abc","def","ghi","jkl", "mno","pqrs","tuv","wxyz"};

        String result = "";

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println("Input "+input);


        String inputPairs[] = input.split(" ");

        for (String pair:
                inputPairs) {

            System.out.println("Current Pair "+pair);

            if(pair.equals("0")){
                result+=" ";
                continue;
            }

            int numericKey = Integer.parseInt(pair.split(",")[0]);
            int numberOfPresses = Integer.parseInt(pair.split(",")[1]);



            System.out.println("Key "+numericKey+" Pressed "+numberOfPresses+" times. ");

            if(numericKey == 9 || numericKey == 7){
                if(numberOfPresses > 4){
                    numberOfPresses = numberOfPresses % 4;

                    if(numberOfPresses == 0){
                        numberOfPresses = 4;
                    }
                }
            }else{
                if(numberOfPresses > 3){
                    numberOfPresses = numberOfPresses %3;

                    if(numberOfPresses == 0){
                        numberOfPresses = 3;
                    }
                }
            }



            System.out.println("Computed Key Presses for "+numericKey+" is "+numberOfPresses);

//            String selectedChar = mapping[numberOfPresses-1];


            String selectedCharString = mapping[numericKey];

            char selectedChar = selectedCharString.charAt(numberOfPresses -1);

            result+= selectedChar;
        }

        System.out.println("Final");
        System.out.println(result);
    }
}