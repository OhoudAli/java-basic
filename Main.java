import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ohood Ali Kaabi


        //Q1 : Develop a program that takes the weight in (Kilograms) and height in (meters)
        // as input and calculates the BMI, then prints it.
        //• Input: Weight (kg) = 70, Height (m) = 1.75
        //• Expected Output: BMI = 22.86

        System.out.println("Please enter your Weight in kilogram!!");
        float weight = input.nextFloat();
        System.out.println("Please enter your Height in Meters!!");
        // does not work when i use the .nextFloat(); , so i try until it work this way
        float height = Float.parseFloat(input.next());
        float squaring_height = height * height;
        float bmi = (weight/squaring_height);
        System.out.printf("Your BMI is %.2f",bmi);

//      Q2:   write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//• Input: Obtained Marks = 85, Total Marks = 100
//• Expected Output: Percentage = 85.0%


        System.out.println("Please enter yor Marks : ");
        int mark_value = input.nextInt();
        System.out.println("Please enter the Total Marks : ");
        int total_value = input.nextInt();
        float precentage_value = ((float) mark_value /total_value)*100;
        System.out.println("The Percentage of marks and total marks = "+precentage_value+"%");


//      Q3: Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
//• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//• Expected Output: Amount in EUR = 85.0

        System.out.println("Please enter your currency amount in USD to EUR: ");
        double old_currency = input.nextDouble();
        double EUR_currency = 0.85;
        System.out.printf("The transfer from USD to EUR is = %.1f",EUR_currency*old_currency);


//     Q4: Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//• Input: "Hello, World!"
//• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
//                ,olleH"

        System.out.println("Please enter any sentence you like to calculate its length and reverse it :");
        String sentence = input.nextLine();
        StringBuilder rev = new StringBuilder();
        System.out.println("Length of the string: "+sentence.length());
        rev.append(sentence);
        rev.reverse();
        System.out.print(" And Reversed string: \""+rev+"\"");


//      Q5: Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
//                = 10, End Index = 20
//• Expected Output: "brown fox"

          System.out.println("Please enter the sentence :");
          String the_sentence = input.nextLine();
          System.out.println("Please enter the start index :");
          int start_index = input.nextInt();
          System.out.println("Please enter the end index : ");
          int end_index = input.nextInt();

          System.out.println("The extracted substring : \""+the_sentence.substring(start_index,end_index)+"\"");

// Q6: Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
//                "jumps"
//• Expected Output: Keyword "jumps" is present in the sentence.

        System.out.println("Please enter the sentence: ");
        String user_sentence = input.nextLine();
        System.out.println("Please enter the Keyword: ");
        String user_keyword = input.nextLine();
        boolean checking_sentence = user_sentence.contains(user_keyword);
        if(checking_sentence == true) {
            System.out.println("Keyword " + user_keyword + " is present in the sentence.");
        }
        else {
            System.out.println("try another word");
        }

//  Q7:   Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
//        Replace = "fox", Replacement Word = "cat"
//• Expected Output: "The quick brown cat jumps over the lazy dog"


        System.out.println("Please enter the sentence: ");
        String user_sentencee = input.nextLine();
        System.out.println("Please enter the word you want to replace: ");
        String user_word = input.nextLine();
        System.out.println("Please enter the word you want to replace it with: ");
        String user_replace_word = input.nextLine();
        System.out.println("The sentence Before replacing: "+user_sentencee);
        System.out.print("The sentence after replacing: "+user_sentencee.replaceAll(user_word,user_replace_word));


// Q8    Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.
//• Input: String 1 = "Hello", String 2 = "hello"
//• Expected Output: Strings are equal (ignoring case).

        System.out.println("Please enter your String: ");
        String word1 = input.nextLine();
        System.out.println("Please enter another String to compair with: ");
        String word2 = input.nextLine();
        if (word1.equalsIgnoreCase(word2) == true) {
            System.out.println("Strings are equals (ignoring case).");
     }
    }
}