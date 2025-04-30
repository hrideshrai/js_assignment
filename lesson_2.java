import java.util.Scanner;

public class lesson_2 {
//WRITE A METHOD TO CHECK ALL ODD NUMBERS FROM 1 TO A GIVEN NUMBER N:
static void printOddNumbers(int n){
    for (int i=1; i<=n; i+=2){
        System.out.print(i + " ");

    }

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("The odd numbers are:");
        printOddNumbers(number);
    }
}
