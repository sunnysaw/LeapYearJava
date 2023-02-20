/*
Question : Write a program to check whether the given year is leap year or not.
_________________________________________________________________________________
To determine whether a year is a leap year, follow these steps:

1 : If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2 : If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3 : If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4 : The year is a leap year (it has 366 days).
5 : The year is not a leap year (it has 365 days).
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check whether it leap year or not :");
        int year= sc.nextInt();
        System.out.println("Printing the final result :");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year : " + year);
        }else
            System.out.println("Not a leap year : " + year);
    }
}