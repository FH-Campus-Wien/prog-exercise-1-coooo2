package at.ac.fhcampuswien;

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
    public void sumOfLiterals(){
        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){

        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a+b;

        System.out.println(c);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){

        Scanner sc =new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

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

        Scanner sc =new Scanner(System.in);
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
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
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