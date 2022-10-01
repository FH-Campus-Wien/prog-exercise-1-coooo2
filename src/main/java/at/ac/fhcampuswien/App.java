package at.ac.fhcampuswien;

import java.awt.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){

        System.out.println("Hello World!");

    }

    //todo Task 2
    public void helloRobot(){

        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){                                                                                        //https://www.straub.as/java/basic/const.html
                                                                                                                        //https://www.geeksforgeeks.org/literals-in-java/#:~:text=Literal%3A%20Any%20constant%20value%20which,%2C%20character%2C%20or%20string%20data.
        char a = 'Z';
        int a1 = (int) a;

        int b =  0xface;

        int c = 012;

        long d = 80L;
        int d1 = (int) d;

        float e = 44e-1f;
        int e1 = (int) e;

        float f = 5.5f;
        int f1 = (int) f;

        double g = 8.88e1;
        int g1 = (int) g;

        double h = 99.9;
        int h1 = (int) h;


        int sum = (a1+b+c+d1+e1+f1+g1+h1);

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){                                                                                        //https://stackoverflow.com/questions/2912817/how-to-use-scanner-to-accept-only-valid-int-as-input

        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a+b;

        System.out.println(c);
    }

    //todo Task 5
    public void swapTwoNumbers(){

        Scanner scan5 =new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");         int x = scan5.nextInt();

        System.out.print("y: ");         int y = scan5.nextInt();

        /** the following 4 lines have been taken from the internet|
         * //https://www.java-forum.org/thema/inhalte-zweier-variablen-tauschen.10038/,
         * last visit 30.09.2022*/

        x+=y;
        y-=x;
        x+=y;
        y*=-1;




        System.out.println("After Swap:");
        System.out.print("x: "); System.out.println(x);

        System.out.print("y: "); System.out.println(y);


    }

    //todo Task 6
    public void compareTwoNumbers(){

        Scanner sc =new Scanner(System.in);                                                                             //https://www.w3schools.com/java/java_conditions.asp

        System.out.print("n1: ");           int n1 = sc.nextInt();

        System.out.print("n2: ");           int n2 = sc.nextInt();

        if (n1 > n2) {

            System.out.println("n1 > n2");

        } else if (n2 > n1) {

            System.out.println("n2 > n1");

        } else {
            System.out.println("n1 == n2");

        }
    }

    //todo Task 7
    public void ratingSalesPerson(){

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");

        int a = sc.nextInt();


        if (a < 0) {

            System.out.println("Invalid Revenue");

        } else if (a >= 100000) {

            System.out.println("Invalid Revenue");

        } else if (a == 0) {

            System.out.println("Poor Sales Revenue");

        } else if (a < 20000) {

            System.out.println("Poor Sales Revenue");

        } else if (20000 == a) {

            System.out.println("Average Sales Revenue");

        } else if (a < 50000) {

            System.out.println("Average Sales Revenue");

        } else if (50000 == a) {

            System.out.println("Good Sales Revenue");

        } else if (a < 80000) {

            System.out.println("Good Sales Revenue");

        } else {

            System.out.println("Excellent Sales Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){

        Scanner sc =new Scanner(System.in);                                                                             //https://www.w3schools.com/java/java_switch.asp
        System.out.print("Enter CommissionClass: ");

        int a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");

        }

    }

    //todo Task 9
    public void leapyear(){

        Scanner scan =new Scanner(System.in);
        System.out.print("Year: ");

        int a = scan.nextInt();

        /** This line of Code ( the condition from the if code) has been taken from the internet |
        * https://stackoverflow.com/questions/1021324/java-code-for-calculating-leap-year,
        * last visit: 30.09.2022*/

        if ((((a % 4) == 0) && ((a % 100) != 0) || (a % 400 == 0))){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }


    }

    //todo Task 10
    public void transposedNumbers(){

        /** the following 9 lines of Code have been taken from the internet |
         * https://www.sanfoundry.com/java-program-reverse-given-number/,
         * last visit: 30.09.2022*/

        int m, n, sum = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Number: ");
        m = s.nextInt();
        while (m > 0)
        {
            n = m % 10;
            sum = sum * 10 +n;
            m = m/10;
        }
        System.out.println(+sum);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}