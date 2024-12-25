import java.util.Scanner;

public class Solution3 {
    //program which takes user input and prints day position
    public static void main(String[] args) {
            //create array
            String[] daysOfTheWeek = {"Sunday","Monday", "Tuesday", "Wednesday","Thursday", "Friday","Saturday"};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the day position: ");
            //try catch to handle printing day position
            try {
                int day = scanner.nextInt();

                if (day < 0 || day >= daysOfTheWeek.length) {
                    throw new ArrayIndexOutOfBoundsException("Invalid day position.");
                }

                String dayName = daysOfTheWeek[day];
                System.out.println("The day is: "+dayName);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: "+ e.getMessage());
            } catch (Exception e) {
                System.err.println("Invalid input.");
            }
        }
    }

