import java.util.Scanner;

public class que_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    // QUESTION NO.25:
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int digitCount = 0;

    if (number == 0) {
        digitCount = 1;
    } else {
        while (number != 0) {
            number /= 10; 
            digitCount++; 
        }
    }

    // Display the result
    System.out.println("The number has " + digitCount + " digits.");

    
    // QUESTION NO.24:
        // System.out.print("Enter a number n: ");
        // int n = scanner.nextInt();

        // int firstTerm = 0, secondTerm = 1;

        // System.out.println("The first " + n + " terms of the Fibonacci series are:");

        // for (int i = 1; i <= n; i++) {
        //     System.out.print(firstTerm + " "); 
        //     int nextTerm = firstTerm + secondTerm; 
        //     firstTerm = secondTerm; 
        //     secondTerm = nextTerm; 
        // }

        // QUESTION NO.23:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // int originalNumber = number;
        // int reversedNumber = 0;

        // while (number != 0) {
        //     int digit = number % 10; 
        //     reversedNumber = reversedNumber * 10 + digit; 
        //     number /= 10; 

        // if (originalNumber == reversedNumber) {
        //     System.out.println(originalNumber + " is a palindrome.");
        // } else {
        //     System.out.println(originalNumber + " is not a palindrome.");
        // }

        // QUESTION NO.22:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // int reversedNumber = 0;

        // while (number != 0) {
        //     int digit = number % 10; 
        //     reversedNumber = reversedNumber * 10 + digit; 
        //     number /= 10; 
        // }

        // System.out.println("The reversed number is: " + reversedNumber);

        // QUESTION NO.21:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // int sum = 0;

        // while (number != 0) {
        //     sum += number % 10; 
        //     number /= 10; 
        // }

        // System.out.println("The sum of the digits is: " + sum);


        // QUESTION 20:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // boolean isPerfectSquare = false;
        // for (int i = 1; i * i <= number; i++) {
        //     if (i * i == number) {
        //         isPerfectSquare = true;
        //         break;
        //     }
        // }

        // if (isPerfectSquare) {
        //     System.out.println(number + " is a perfect square.");
        // } else {
        //     System.out.println(number + " is not a perfect square.");
        // }

        // QUSTION NO.19:
        // System.out.print("Enter a character: ");
        // char ch = scanner.next().charAt(0);

        // ch = Character.toLowerCase(ch);

        // switch (ch) {
        //     case 'a':
        //     case 'e':
        //     case 'i':
        //     case 'o':
        //     case 'u':
        //         System.out.println(ch + " is a vowel.");
        //         break;
        //     default:
        //         System.out.println(ch + " is not a vowel.");
        // }
    
 // QUESTION NO.18:
        // System.out.print("Enter a month number (1-12): ");
        // int monthNumber = scanner.nextInt();

        // switch (monthNumber) {
        //     case 1: 
        //     case 3: 
        //     case 5: 
        //     case 7: 
        //     case 8: 
        //     case 10:
        //     case 12:
        //         System.out.println("31 days");
        //         break;
        //     case 4: 
        //     case 6: 
        //     case 9: 
        //     case 11: 
        //         System.out.println("30 days");
        //         break;
        //     case 2: 
        //         System.out.print("Enter the year: ");
        //         int year = scanner.nextInt();
        //         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //             System.out.println("29 days (Leap Year)");
        //         } else {
        //             System.out.println("28 days");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid month number! Please enter a number between 1 and 12.");
        // }
// QUESTION NO. 17:
        // System.out.print("Enter a number (1-7): ");
        // int dayNumber = scanner.nextInt();

        // switch (dayNumber) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Invalid input! Please enter a number between 1 and 7.");
        // }
 
                // QUESTION NO.16:
        // System.out.print("Enter the first number: ");
        // double num1 = scanner.nextDouble();

        // System.out.print("Enter the second number: ");
        // double num2 = scanner.nextDouble();

        // System.out.print("Enter the operator (+, -, *, /): ");
        // char operator = scanner.next().charAt(0);

        // double result;
        // switch (operator) {
        //     case '+':
        //         result = num1 + num2;
        //         System.out.println("Result: " + result);
        //         break;
        //     case '-':
        //         result = num1 - num2;
        //         System.out.println("Result: " + result);
        //         break;
        //     case '*':
        //         result = num1 * num2;
        //         System.out.println("Result: " + result);
        //         break;
        //     case '/':
        //         if (num2 != 0) {
        //             result = num1 / num2;
        //             System.out.println("Result: " + result);
        //         } else {
        //             System.out.println("Error! Division by zero is not allowed.");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid operator! Please use +, -, *, or /.");
        // }

// QUSTION NO.15:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // long factorial = 1;

        // for (int i = 1; i <= number; i++) {
        //     factorial *= i;
        // }

        // System.out.println("The factorial of " + number + " is: " + factorial);



 // QUESTION NO.14:
        // System.out.println("Even numbers from 1 to 100:");
        // for (int i = 2; i <= 100; i += 2) {
        //     System.out.println(i);
        // }
 // QUESTION NO.13:
        // System.out.print("Enter a number n: ");
        // int n = scanner.nextInt();

        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     sum += i; 
        // }

        // System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

 // QUESTION NO.12:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // System.out.println("Multiplication Table of " + number + ":");
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(number + " x " + i + " = " + (number * i));
        // }
     //QUESTION NO.11
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // boolean isPrime = true;

        // if (number <= 1) {
        //     isPrime = false;
        // } else {
        //     for (int i = 2; i <= Math.sqrt(number); i++) {
        //         if (number % i == 0) {
        //             isPrime = false; // Found a divisor, it's not prime
        //             break;
        //         }
        //     }
        // }

        // if (isPrime) {
        //     System.out.println(number + " is a prime number.");
        // } else {
        //     System.out.println(number + " is not a prime number.");
        // }

 // QUESTION NO.10:
        // System.out.print("Enter a year: ");
        // int year = scanner.nextInt();

        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //     System.out.println(year + " is a leap year.");
        // } else {
        //     System.out.println(year + " is not a leap year.");
        // }

    // QUESTION NO.9:
        // int subject1, subject2, subject3, subject4, subject5;

        // System.out.print("Enter marks for Subject 1: ");
        // subject1 = scanner.nextInt();
        
        // System.out.print("Enter marks for Subject 2: ");
        // subject2 = scanner.nextInt();
        
        // System.out.print("Enter marks for Subject 3: ");
        // subject3 = scanner.nextInt();
        
        // System.out.print("Enter marks for Subject 4: ");
        // subject4 = scanner.nextInt();
        
        // System.out.print("Enter marks for Subject 5: ");
        // subject5 = scanner.nextInt();
        
        // int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        // double percentage = (totalMarks / 5.0);

        // System.out.println("Total Marks = " + totalMarks);
        // System.out.println("Percentage = " + percentage + "%");

        // if (percentage >= 90) {
        //     System.out.println("Grade: A+");
        // } else if (percentage >= 80) {
        //     System.out.println("Grade: A");
        // } else if (percentage >= 70) {
        //     System.out.println("Grade: B");
        // } else if (percentage >= 60) {
        //     System.out.println("Grade: C");
        // } else if (percentage >= 50) {
        //     System.out.println("Grade: D");
        // } else {
        //     System.out.println("Grade: F (Fail)");
        // }
        //QUESTION NO.8:
        // System.out.print("Enter a character: ");
        // char ch = scanner.next().charAt(0); 

        // if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        //         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        //         System.out.println(ch + " is a vowel.");
        //     } else {
        //         System.out.println(ch + " is a consonant.");
        //     }
        // } else {
        //     System.out.println("The input is not a valid alphabet character.");
        // }
// QUESTION NO.7:
    //    System.out.print("Enter your age: ");
    //     int age = scanner.nextInt();

    //     if (age >= 18) {
    //         System.out.println("You are eligible to vote.");
    //     } else {
    //         System.out.println("You are not eligible to vote yet.");
    //     }
 //QUESTION NO 6:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // // Check if the number is even or odd
        // if (number % 2 == 0) {
        //     System.out.println(number + " is even.");
        // } else {
        //     System.out.println(number + " is odd.");
        // }
//QUESTION NO.5:
        // System.out.print("Enter the first number: ");
        // int num1 = scanner.nextInt();

        // System.out.print("Enter the second number: ");
        // int num2 = scanner.nextInt();

        // System.out.print("Enter the third number: ");
        // int num3 = scanner.nextInt();

        // if (num1 >= num2 && num1 >= num3) {
        //     System.out.println("The largest number is: " + num1);
        // } else if (num2 >= num1 && num2 >= num3) {
        //     System.out.println("The largest number is: " + num2);
        // } else {
        //     System.out.println("The largest number is: " + num3);
        // }

 //QUESTION NO.4:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // if (number % 5 == 0 && number % 11 == 0) {
        //     System.out.println(number + " is divisible by both 5 and 11.");
        // } else {
        //     System.out.println(number + " is not divisible by both 5 and 11.");
        // }

 // QUESTION NO.3:
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();

        // if (number > 0) {
        //     System.out.println("The number is positive.");
        // } else if (number < 0) {
        //     System.out.println("The number is negative.");
        // } else {
        //     System.out.println("The number is zero.");
        // }

//QUESTION NO.2:
        // System.out.print("Enter the first number: ");
        // double num1 = scanner.nextDouble();

        // System.out.print("Enter the second number: ");
        // double num2 = scanner.nextDouble();
        // double sum = num1 + num2;
       
        // double difference = num1 - num2;
        // double product = num1 * num2;
        // double quotient = 0;

        // if (num2 != 0) {
        //     quotient = num1 / num2;
        // } else {
        //     System.out.println("Division by zero is not allowed.");
        // }

        // System.out.println("Sum: " + sum);
        // System.out.println("Difference: " + difference);
        // System.out.println("Product: " + product);

        // if (num2 != 0) {
        //     System.out.println("Quotient: " + quotient);
        // }

// QUESTION NO.1:

        // System.out.print("Enter your full name: ");
        // String fullName = scanner.nextLine(); 

        // System.out.println("Hello, " + fullName + "! Welcome!");

        scanner.close();
    }
}
