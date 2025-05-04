 public class Lesson_two {
    public static void printOddNumbers(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void convertDays(int days) {
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        System.out.println(years + " years " + months + " months " + days + " days");
    }

    public static void isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number");
        } else {
            System.out.println(num + " is not a Harshad number");
        }
    }

    public static void countWords(String str) {
        int count = 0;
        boolean word = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && word == false) {
                word = true;
                count++;
            } else if (str.charAt(i) == ' ') {
                word = false;
            }
        }
        System.out.println("Words: " + count);
    }

    public static void compoundInterest(double p, double r, int t) {
        double amount = p * Math.pow(1 + r / 100, t);
        System.out.println("Compound Interest: " + (amount - p));
    }

    public static void isPalindromePrime(int n) {
        if (!isPrime(n)) {
            System.out.println(n + " is not a prime number");
            return;
        }

        int rev = 0, temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (rev == n) {
            System.out.println(n + " is a Palindrome Prime");
        } else {
            System.out.println(n + " is a Prime but not a Palindrome");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void sumOfNaturalNumbers(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println("Sum = " + sum);
    }

    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void cube(int n) {
        int result = n * n * n;
        System.out.println("Cube = " + result);
    }

    public static void isDuckNumber(int n) {
        String str = Integer.toString(n);
        if (str.indexOf('0') > 0) {
            System.out.println(n + " is a Duck number");
        } else {
            System.out.println(n + " is not a Duck number");
        }
    }

    public static void multiplicationTables() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void countCase(String str) {
        int upper = 0, lower = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') upper++;
            else if (ch >= 'a' && ch <= 'z') lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
    }

    public static void isKaprekar(int n) {
        int sq = n * n;
        String str = Integer.toString(sq);
        for (int i = 1; i < str.length(); i++) {
            String left = str.substring(0, i);
            String right = str.substring(i);
            int l = Integer.parseInt(left);
            int r = Integer.parseInt(right);
            if (r != 0 && (l + r) == n) {
                System.out.println(n + " is a Kaprekar number");
                return;
            }
        }
        if (n == 1) {
            System.out.println("1 is a Kaprekar number");
        } else {
            System.out.println(n + " is not a Kaprekar number");
        }
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static int getAscii(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        printOddNumbers(15);
        convertDays(800);
        isHarshad(18);
        countWords("This is a test");
        compoundInterest(1000, 5, 2);
        isPalindromePrime(131);
        swapWithTemp(5, 10);
        swapWithoutTemp(5, 10);
        sumOfNaturalNumbers(10);
        printFactors(12);
        cube(4);
        isDuckNumber(1023);
        multiplicationTables();
        System.out.println("Sum of squares = " + sumOfSquares(123));
        countCase("Java Programming");
        isKaprekar(45);
        System.out.println("Reversed = " + reverseNumber(1234));
        fibonacci(10);
        System.out.println("ASCII of A = " + getAscii('A'));
    }
} 
    

