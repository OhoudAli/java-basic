import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Q1 : Develop a program that takes the weight in (Kilograms) and height in (meters)
        // as input and calculates the BMI, then prints it.
        //• Input: Weight (kg) = 70, Height (m) = 1.75
        //• Expected Output: BMI = 22.86

//        System.out.println("Please enter your Weight in kilogram!!");
//        float weight = input.nextFloat();
//        System.out.println("Please enter your Height in Meters!!");
//        // does not work when i use the .nextFloat(); , so i try until it work this way
//        float height = Float.parseFloat(input.next());
//        float squaring_height = height * height;
//        float bmi = (weight/squaring_height);
//        System.out.printf("Your BMI is %.2f",bmi);

//   Q2:   write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//• Input: Obtained Marks = 85, Total Marks = 100
//• Expected Output: Percentage = 85.0%


//        System.out.println("Please enter yor Marks : ");
//        int mark_value = input.nextInt();
//        System.out.println("Please enter the Total Marks : ");
//        int total_value = input.nextInt();
//        float precentage_value = ((float) mark_value /total_value)*100;
//        System.out.println("The Percentage of marks and total marks = "+precentage_value+"%");


//       Q3: Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
//• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//• Expected Output: Amount in EUR = 85.0

        System.out.println("Please enter your currency amount in USD to EUR: ");
        double old_currency = input.nextDouble();
        double EUR_currency = 0.85;
        System.out.printf("The transfer from USD to EUR is = %.2f",(EUR_currency/old_currency)*100);


//     Q4   Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//• Input: "Hello, World!"
//• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
//                ,olleH"
//        System.out.println("Please enter any sentence you like to calculate its length and reverse it :");
//        String sentence = input.nextLine();
//        StringBuilder rev = new StringBuilder();
//        System.out.println("Length of the string: "+sentence.length());
//        rev.append(sentence);
//        rev.reverse();
//        System.out.print(" And Reversed string: "+rev);

    }
}