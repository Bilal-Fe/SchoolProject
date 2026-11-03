package YildizCollage;

import java.util.Scanner;

public class Utility {
static Scanner scan = new Scanner(System.in);


    public static void mainMenu() throws InterruptedException {
String selection = "";
do {
    System.out.println("====== Yildiz Collage ======\n" +
            "========= Main Menu ========\n" +
            "\n" +
            "1- View School Information \n" +
            "2- Teacher Menu\n" +
            "3- Student Menu\n" +
            "Q- EXIT");
    System.out.println("Please enter your input");
    selection = scan.nextLine();

    switch(selection){
        case "1" : //School information
            printShoolInformation();
            break;
        case "2" : //Teacher menu
            Teacher.teacherMenu();
            break;
        case "3" : //Student menugit
            Student.studentMenu();
            break;
        case "q" :
        case "Q" :
            break;
        default:
            System.out.println("Please enter a valid value!!");
    }

}while(!selection.equalsIgnoreCase("q"));
Utility.stopProject();
    }

    public static void printShoolInformation() throws InterruptedException {
        System.out.println("====== Yildiz Collage ======\n" +
        "address: "+ School.address +
                "\n Phone number: "+ School.phone +"\n"
                );
        Thread.sleep(5000);
    }

    public static void stopProject() {
        System.out.println("You exit the project");
        System.exit(0);
    }

}
