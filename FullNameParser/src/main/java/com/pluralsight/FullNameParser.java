package com.pluralsight;


import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        //Values to get from user

        //Prompt user to enter their name.
        System.out.print("Please enter your name ");
        String fullName = scanner.nextLine().trim();

        //A string variable named spaces that looks at our full name and uses method.spit
        String[] splitName = fullName.split(" ");

        String firstName = splitName[0];//address 0 is first value.
        String middleName;
        String lastName;


        if (splitName.length == 2){
            middleName = "";
            lastName = splitName[1];
        }
        else {
            middleName = splitName[1];
            lastName = splitName[2];
        }



        //Display the users name in 1 of 2 ways


        System.out.println("First Name:"+ firstName);
        System.out.println("Middle Name:" + middleName);
        System.out.println("Last Name:" + lastName);

        //First name  :
        //Middle name :
        //Last name   :

        //or

        //First name  :
        //Middle name : (none)
        //Last name   :

        //use if statement to select print style
    }
}
